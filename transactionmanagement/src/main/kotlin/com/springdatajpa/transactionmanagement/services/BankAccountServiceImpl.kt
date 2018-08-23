package com.springdatajpa.transactionmanagement.services

import com.springdatajpa.transactionmanagement.entities.BankAccount
import com.springdatajpa.transactionmanagement.repositories.BankAccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BankAccountServiceImpl: BankAccountService {
    @Autowired
    lateinit var bankAccountRepository: BankAccountRepository

    @Transactional
    @Override
    override fun transfer(from: BankAccount, to: BankAccount, amount: Double) {
        from.balance -= amount
        to.balance += amount
        bankAccountRepository.save(from)
        bankAccountRepository.save(to)
    }
}