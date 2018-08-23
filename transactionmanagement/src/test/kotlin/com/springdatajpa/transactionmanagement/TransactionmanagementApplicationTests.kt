package com.springdatajpa.transactionmanagement

import com.springdatajpa.transactionmanagement.entities.BankAccount
import com.springdatajpa.transactionmanagement.repositories.BankAccountRepository
import com.springdatajpa.transactionmanagement.services.BankAccountServiceImpl
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class TransactionmanagementApplicationTests {

	@Autowired
	lateinit var bankAccountRepository: BankAccountRepository

	@Autowired
	lateinit var bankAccountService: BankAccountServiceImpl

	@Test
	fun contextLoads() {
	}

	@Test
	fun testTransfer(){
		var obama = bankAccountRepository.findById(1).get()
		var trump = bankAccountRepository.findById(2).get()

		bankAccountService.transfer(trump, obama, 1000.00)
	}

}
