package com.kotlinapi.model.entity

import org.hibernate.Hibernate
import javax.persistence.*

@Entity
@Table(name = "Users")
data class User(
    var firstName: String,
    var lastName: String,
    var email: String,
    var phone: Int,
    var password: String,
    var active: Boolean
) : BaseEntity() {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as User

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , firstName = $firstName , lastName = $lastName , email = $email , phone = $phone , password = $password , active = $active )"
    }
}