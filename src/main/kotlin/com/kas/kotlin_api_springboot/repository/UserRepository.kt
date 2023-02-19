package com.kas.kotlin_api_springboot.repository

import com.kas.kotlin_api_springboot.model.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository : JpaRepository<User, UUID>
