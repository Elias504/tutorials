package com.springdatajpa.customerdata

import com.springdatajpa.customerdata.entities.Customer
import com.springdatajpa.customerdata.repository.CustomerRepository
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	lateinit var customerRepo: CustomerRepository

	@Test
	fun contextLoads() {
	}

	@Test
	fun createCustomer(){
		var customer = Customer(1,"Elias Phiri", "phirielias@gmail.com")
		customerRepo.save(customer)
	}

	@Test
	fun readCustomer(){
		var customer: Customer = customerRepo.findById(1).get()
		assertNotNull(customer)
		assertEquals("Elias Phiri", customer.name)
	}

	@Test
	fun updateCustomer(){
		var customer: Customer = customerRepo.findById(1).get()
		customer.name = "Elias-Isaac Phiri"

		customerRepo.save(customer)
	}

	@Test
	fun deleteCustomer(){
		customerRepo.deleteById(1)
	}

	@Test
	fun testFindByNameAndEmail(){
		var customers = customerRepo.findByNameAndEmail("Elias Phiri", "phirielias@gmail.com")
		customers.forEach{System.out.println(it)}
	}

	@Test
	fun testFindByEmailLike(){
		var customers = customerRepo.findByEmailLike("%elias%")
		customers.forEach{System.out.println(it)}
	}

	@Test
	fun testFindByIdIn(){
		var customers = customerRepo.findByIdIn(listOf(1,2,3,4))
		customers.forEach{System.out.println(it)}
	}
}
