package top.yangwulang.platform.cache;

public enum Mode {
    /**
     * 智能模式 自动判断缓存是否存在异常，如果当前级别的缓存中间件存在异常（连接不上），则跳过当前缓存直接交给下一个缓存
     */
    INTELLIGENCE,
    /**
     * 严格模式，当前模式下的当前级别存在异常（连接不上），直接抛出错误
     */
    STRICT
}
