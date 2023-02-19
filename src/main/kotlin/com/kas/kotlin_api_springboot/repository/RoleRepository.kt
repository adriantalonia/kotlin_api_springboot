package com.kas.kotlin_api_springboot.repository

import com.kas.kotlin_api_springboot.model.entity.Role
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface RoleRepository : JpaRepository<Role, UUID>
