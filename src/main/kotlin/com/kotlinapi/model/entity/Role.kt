package com.kotlinapi.model.entity

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "roles", schema = "public")
data class Role(
    var name: String,
    var description: String
) : BaseEntity() {
}