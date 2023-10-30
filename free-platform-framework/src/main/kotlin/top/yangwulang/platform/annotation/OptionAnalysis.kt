package top.yangwulang.platform.annotation

/**
 * 操作分析，用户事件分析，用户画像基础
 */
@Target(allowedTargets = [AnnotationTarget.FUNCTION])
@Retention()
annotation class OptionAnalysis(
    /**
     * 事件名称
     */
    val eventName: String,
    /**
     * 事件编码
     */
    val eventCode: String
)