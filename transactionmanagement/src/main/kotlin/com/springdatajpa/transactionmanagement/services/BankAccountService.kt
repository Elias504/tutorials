package com.springdatajpa.transactionmanagement.services

import com.springdatajpa.transactionmanagement.entities.BankAccount

interface BankAccountService {
    fun transfer(from: BankAccount, to: BankAccount, amount: Double)
}