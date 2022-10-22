package com.kotlinapi.repository

import com.kotlinapi.model.entity.User
import org.springframework.data.repository.CrudRepository
import java.util.UUID;

interface UserRepository : CrudRepository<User, UUID> {

}