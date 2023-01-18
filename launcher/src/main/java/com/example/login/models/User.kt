import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class User(
    var userId: String? = "",
    var userName: String? = "",
    var email: String? = "",
    var guardianId: String ?= "",
    var isGuardian: Boolean? = false,
    var isKid: Boolean? = false,
) {

    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "userId" to userId,
            "userName" to userName,
            "email" to email,
            "guardianId" to guardianId,
            "isGuardian" to isGuardian,
            "isKid" to isKid,
        )
    }
}