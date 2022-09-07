package com.kotlinapi.model.entity

import javax.persistence.*

@Entity
@Table(name = "Users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?,
    var firstName: String,
    var lastName: String,
    var email: String,
    var phone: Int,
    var password: String,
    var active: Boolean
) {
}