package com.springdatajpa.customerdata.repository

import com.springdatajpa.customerdata.entities.Customer
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface CustomerRepository: JpaRepository<Customer, Long>{
    fun findByName(name: String, pageable: Pageable): List<Customer>
    fun findByNameAndEmail(name: String, email: String): List<Customer>
    fun findByEmailLike(email: String): List<Customer>
    fun findByIdIn(ids: List<Long>): List<Customer>

    @Modifying
    @Query("update Customer set email = :email where id = :id " )
    fun updateEmailById(@Param("id") id: Long, @Param("email") email: String)
}