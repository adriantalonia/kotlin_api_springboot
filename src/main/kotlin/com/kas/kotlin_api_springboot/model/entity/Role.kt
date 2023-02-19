package com.kas.kotlin_api_springboot.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "roles", schema = "public")
data class Role(
    var name: String,
    var description: String
) : BaseEntity()
