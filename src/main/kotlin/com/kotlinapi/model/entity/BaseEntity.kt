package com.kotlinapi.model.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity {
    @Id
    @Column(name = "id", length = 16, unique = true, nullable = false)
    open val id: UUID = UUID.randomUUID()
}