package com.springdatajpa.customerdata.repository

import com.springdatajpa.customerdata.entities.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<Customer, Long>{
    fun findByNameAndEmail(name: String, email: String): List<Customer>
    fun findByEmailLike(email: String): List<Customer>
    fun findByIdIn(ids: List<Long>): List<Customer>
}