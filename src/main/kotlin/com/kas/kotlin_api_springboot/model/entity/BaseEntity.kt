package com.kas.kotlin_api_springboot.model.entity

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.Date
import java.util.UUID

@MappedSuperclass
open class BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", length = 16, unique = true, nullable = false)
    val id: UUID = UUID.randomUUID()

    @CreationTimestamp
    lateinit var created: Date

    @UpdateTimestamp
    lateinit var modified: Date
}
