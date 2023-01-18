package com.example.login.models

import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Progress(
    var userId: String? = "",
    var stampId: String? = "",
    var email: String? = "",
    var screeName: String? = "",
    var timeSpend: String? = "",
) {
    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "userId" to userId,
            "stampId" to stampId,
            "email" to email,
            "screeName" to screeName,
            "timeSpend" to timeSpend,
        )
    }
}
