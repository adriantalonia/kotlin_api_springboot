package com.kas.kotlin_api_springboot.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.Table

@Entity
@Table(name = "users", schema = "public")
class User(
    var firstName: String,
    var lastName: String,
    var email: String,
    var phone: Int,
    var password: String,
    var active: Boolean,

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        schema = "public", name = "user_roles",
        joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")]
    )
    val roles: Set<Role> = mutableSetOf()
) : BaseEntity()
