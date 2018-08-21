package com.springdatajpa.componentmapping.repositories

import com.springdatajpa.componentmapping.entities.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository: JpaRepository<Employee, Long>