package com.gyro.tests

/* DO NOT EDIT | Generated by gyro */

import java.util.Date

import io.realm.RealmObject
import io.realm.annotations.Required

open class User : RealmObject() {

    object Attributes {
        const val BIRTHDAY: String = "birthday"
        const val NAME: String = "name"
        const val TYPE: String = "type"
    }

    object Relationships {
        const val FIDELITY_CARD: String = "fidelityCard"
    }

    @Required
    var birthday: Date = Date()
    @Required
    var name: String = ""
    @Required
    var type: String = "TypeBOne"
    var fidelityCard: FidelityCard? = null

    fun getTypeEnum(): TypeB? = TypeB.get(type)

    fun setTypeEnum(type: TypeB) {
        this.type = type.jsonValue
    }
}