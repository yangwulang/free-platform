package top.yangwulang.platform.entity.sys

import java.math.BigDecimal
import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "sys_user")
open class SysUser {
    @Id
    @Size(max = 100)
    @Column(name = "user_code", nullable = false, length = 100)
    open var id: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "login_code", nullable = false, length = 100)
    open var loginCode: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "user_name", nullable = false, length = 100)
    open var userName: String? = null

    @Size(max = 200)
    @NotNull
    @Column(name = "password", nullable = false, length = 200)
    open var password: String? = null

    @Size(max = 300)
    @Column(name = "email", length = 300)
    open var email: String? = null

    @Size(max = 100)
    @Column(name = "mobile", length = 100)
    open var mobile: String? = null

    @Size(max = 100)
    @Column(name = "phone", length = 100)
    open var phone: String? = null

    @Column(name = "sex")
    open var sex: Char? = null

    @Size(max = 1000)
    @Column(name = "avatar", length = 1000)
    open var avatar: String? = null

    @Size(max = 200)
    @Column(name = "sign", length = 200)
    open var sign: String? = null

    @Size(max = 100)
    @Column(name = "wx_openid", length = 100)
    open var wxOpenid: String? = null

    @Size(max = 100)
    @Column(name = "mobile_imei", length = 100)
    open var mobileImei: String? = null

    @Size(max = 16)
    @NotNull
    @Column(name = "user_type", nullable = false, length = 16)
    open var userType: String? = null

    @Size(max = 64)
    @Column(name = "ref_code", length = 64)
    open var refCode: String? = null

    @Size(max = 100)
    @Column(name = "ref_name", length = 100)
    open var refName: String? = null

    @NotNull
    @Column(name = "mgr_type", nullable = false)
    open var mgrType: Char? = null

    @Column(name = "pwd_security_level", precision = 1)
    open var pwdSecurityLevel: BigDecimal? = null

    @Column(name = "pwd_update_date")
    open var pwdUpdateDate: Instant? = null

    @Size(max = 1000)
    @Column(name = "pwd_update_record", length = 1000)
    open var pwdUpdateRecord: String? = null

    @Size(max = 200)
    @Column(name = "pwd_question", length = 200)
    open var pwdQuestion: String? = null

    @Size(max = 200)
    @Column(name = "pwd_question_answer", length = 200)
    open var pwdQuestionAnswer: String? = null

    @Size(max = 200)
    @Column(name = "pwd_question_2", length = 200)
    open var pwdQuestion2: String? = null

    @Size(max = 200)
    @Column(name = "pwd_question_answer_2", length = 200)
    open var pwdQuestionAnswer2: String? = null

    @Size(max = 200)
    @Column(name = "pwd_question_3", length = 200)
    open var pwdQuestion3: String? = null

    @Size(max = 200)
    @Column(name = "pwd_question_answer_3", length = 200)
    open var pwdQuestionAnswer3: String? = null

    @Column(name = "pwd_quest_update_date")
    open var pwdQuestUpdateDate: Instant? = null

    @Size(max = 100)
    @Column(name = "last_login_ip", length = 100)
    open var lastLoginIp: String? = null

    @Column(name = "last_login_date")
    open var lastLoginDate: Instant? = null

    @Column(name = "freeze_date")
    open var freezeDate: Instant? = null

    @Size(max = 200)
    @Column(name = "freeze_cause", length = 200)
    open var freezeCause: String? = null

    @Column(name = "user_weight", precision = 8)
    open var userWeight: BigDecimal? = null

    @NotNull
    @Column(name = "status", nullable = false)
    open var status: Char? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "create_by", nullable = false, length = 64)
    open var createBy: String? = null

    @NotNull
    @Column(name = "create_date", nullable = false)
    open var createDate: Instant? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "update_by", nullable = false, length = 64)
    open var updateBy: String? = null

    @NotNull
    @Column(name = "update_date", nullable = false)
    open var updateDate: Instant? = null

    @Size(max = 500)
    @Column(name = "remarks", length = 500)
    open var remarks: String? = null

    @Size(max = 64)
    @NotNull
    @Column(name = "corp_code", nullable = false, length = 64)
    open var corpCode: String? = null

    @Size(max = 100)
    @NotNull
    @Column(name = "corp_name", nullable = false, length = 100)
    open var corpName: String? = null
}