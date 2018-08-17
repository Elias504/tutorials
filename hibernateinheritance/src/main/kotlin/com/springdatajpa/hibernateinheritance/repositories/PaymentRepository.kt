package com.springdatajpa.hibernateinheritance.repositories

import com.springdatajpa.hibernateinheritance.entities.Payment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentRepository: JpaRepository<Payment, Long>