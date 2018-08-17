package com.springdatajpa.hibernateinheritance

import com.springdatajpa.hibernateinheritance.entities.Card
import com.springdatajpa.hibernateinheritance.entities.Cheque
import com.springdatajpa.hibernateinheritance.entities.Payment
import com.springdatajpa.hibernateinheritance.repositories.PaymentRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class HibernateinheritanceApplicationTests {

	@Autowired
	lateinit var paymentRepository: PaymentRepository

	@Test
	fun contextLoads() {
	}

	@Test
	fun createCardPayment(){
		paymentRepository.save(Card(1, 10000.00, "123456789"))
	}

	@Test
	fun createChequePayment(){
		paymentRepository.save(Cheque(2, 2500.00, "987654321"))
	}
}
