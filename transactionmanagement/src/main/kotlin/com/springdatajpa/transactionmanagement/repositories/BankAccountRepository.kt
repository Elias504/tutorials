package com.springdatajpa.transactionmanagement.repositories

import com.springdatajpa.transactionmanagement.entities.BankAccount
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BankAccountRepository: JpaRepository<BankAccount, Long>