package com.springdatajpa.customerdata.repository

import com.springdatajpa.customerdata.dao.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<Customer, Long>