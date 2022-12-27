package top.yangwulang.platform.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

public class PropertiesUtils {
    public static final String[] DEFAULT_CONFIG_FILE = new String[]{
            "classpath:application.yml",
            "classpath:config/application.yml",
            "classpath:bootstrap.yml",
            "classpath:config/bootstrap.yml",
            "file:application.yml",
            "file:config/application.yml",
            "file:bootstrap.yml", "" +
            "file:config/bootstrap.yml"
    };
    private static Logger logger = initLogger();
    private final Set<String> configSet = new LinkedHashSet<>();
    private final Properties properties = new Properties();
    private static Environment environment;
    private static Pattern p1 = Pattern.compile("\\$\\{.*?\\}");

    public PropertiesUtils(String... configFiles) {
        for (String location : configFiles) {
            Resource resource = ResourceUtils.getResource(location);
            if (resource.exists()) {
                if (location.endsWith(".properties")) {
                    try {
                        InputStreamReader is = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8);
                        Throwable throwable = null;

                        try {
                            this.properties.load(is);
                            this.configSet.add(location);
                        } catch (Throwable e) {
                            throwable = e;
                            throw e;
                        } finally {
                            if (throwable != null) {
                                try {
                                    is.close();
                                } catch (Throwable e) {
                                    throwable.addSuppressed(e);
                                }
                            } else {
                                is.close();
                            }

                        }
                    } catch (IOException e) {
                        System.err.println("Load " + location + " failure.");
                        e.printStackTrace();
                    }
                } else if (location.endsWith(".yml")) {
                    try {
                        YamlPropertiesFactoryBean bean = new YamlPropertiesFactoryBean();
                        bean.setResources(resource);

                        for (Map.Entry<Object, Object> entry : bean.getObject().entrySet()) {
                            this.properties.put(ObjectUtils.toString(entry.getKey()), ObjectUtils.toString(entry.getValue()));
                        }

                        this.configSet.add(location);
                    } catch (Exception e) {
                        System.err.println("Load " + location + " failure.");
                        e.printStackTrace();
                    }
                }
            }
        }

        this.properties.put("configFiles", StringUtils.join(configFiles, ","));
    }

    public Set<String> getConfigSet() {
        return this.configSet;
    }

    public Properties getProperties() {
        return this.properties;
    }

    public static PropertiesUtils getInstance() {
        return PropertiesUtils.PropertiesLoaderHolder.INSTANCE;
    }

    public static void releadInstance() {
        PropertiesUtils.PropertiesLoaderHolder.releadInstance();
    }

    public String getProperty(String key) {
        String value;
        if (environment != null) {
            value = environment.getProperty(key);
            if (value != null) {
                return value;
            }
        }

        value = this.properties.getProperty(key);
        if (value == null) {
            return System.getProperty(key);
        } else {
            String g;
            String childKey;
            for (Matcher m = p1.matcher(value); m.find(); value = StringUtils.replace(value, g, this.getProperty(childKey))) {
                g = m.group();
                childKey = g.replaceAll("\\$\\{|\\}", "");
            }

            return value;
        }
    }

    public String getProperty(String key, String defaultValue) {
        String value = this.getProperty(key);
        return value != null ? value : defaultValue;
    }

    public static void setEnvironment(Environment environment) {
        PropertiesUtils.environment = environment;
    }

    private static Logger initLogger() {
        String logPath = null;
        if (StringUtils.isNotBlank(System.getProperty("customLogPath"))) {
            logPath = System.getProperty("customLogPath");
        } else {
            try {
                logPath = ResourceUtils.getResource("/").getFile().getPath();
            } catch (Exception var2) {
                logPath = System.getProperty("user.dir");
            }

            String classesLogPath = FileUtils.path(logPath + "/WEB-INF/classes");
            if ((new File(classesLogPath)).exists()) {
                logPath = classesLogPath;
            }
        }

        System.setProperty("logPath", FileUtils.path(logPath));
        return LoggerFactory.getLogger(PropertiesUtils.class);
    }

    private static final class PropertiesLoaderHolder {
        private static PropertiesUtils INSTANCE;

        private PropertiesLoaderHolder() {
        }

        public static void releadInstance() {
            Set<String> configSet = new LinkedHashSet<>();
            Resource[] resources = ResourceUtils.getResources("classpath*:/config/platform-*.*");
            for (Resource resource : resources) {
                configSet.add("classpath:config/" + resource.getFilename());
            }

            Set<String> set = new LinkedHashSet<>();
            Collections.addAll(set, PropertiesUtils.DEFAULT_CONFIG_FILE);

            String customConfigs = System.getProperty("spring.config.location");
            String[] configFiles;
            if (StringUtils.isNotBlank(customConfigs)) {
                configFiles = StringUtils.split(customConfigs, ",");
                for (String configFile : configFiles) {
                    String customConfig = configFile;
                    if (!customConfig.contains("$")) {
                        customConfig = org.springframework.util.StringUtils.cleanPath(customConfig);
                        if (!ResourceUtils.isUrl(customConfig)) {
                            customConfig = "file:" + customConfig;
                        }
                    }

                    set.add(customConfig);
                }
            }

            configFiles = set.toArray(new String[0]);
            String profiles = System.getProperty("spring.profiles.active");
            if (StringUtils.isBlank(profiles)) {
                PropertiesUtils propsTemp = new PropertiesUtils(configFiles);
                profiles = propsTemp.getProperty("spring.profiles.active");
            }

            for (String location : configFiles) {
                configSet.add(location);
                if (StringUtils.isNotBlank(profiles)) {
                    if (location.endsWith(".properties")) {
                        configSet.add(StringUtils.substringBeforeLast(location, ".properties") + "-" + profiles + ".properties");
                    } else if (location.endsWith(".yml")) {
                        configSet.add(StringUtils.substringBeforeLast(location, ".yml") + "-" + profiles + ".yml");
                    }
                }
            }

            configFiles = configSet.toArray(new String[0]);
            PropertiesUtils.logger.debug("Trying: {}", (Object) configFiles);
            INSTANCE = new PropertiesUtils(configFiles);
        }

        static {
            releadInstance();
        }
    }
}
