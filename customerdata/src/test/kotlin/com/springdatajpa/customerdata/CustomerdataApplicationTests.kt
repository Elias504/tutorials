package com.springdatajpa.customerdata

import com.springdatajpa.customerdata.entities.Address
import com.springdatajpa.customerdata.entities.Customer
import com.springdatajpa.customerdata.repository.CustomerRepository
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

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
		customerRepo.save(Customer(name = "Elias Phiri", email = "phirielias@gmail.com", address = Address("1582/u Palm Drive, Chelstone", "Lusaka", "Lusaka", "10101", "Zambia")))
	}

	@Test
	fun readCustomer(){
		var customer: Customer = customerRepo.findById(7).get()
		assertNotNull(customer)
		assertEquals("Elias Phiri", customer.name)
	}

	@Test
	fun updateCustomer(){
		var customer: Customer = customerRepo.findById(7).get()
		customer.name = "Beliya Ndlovu"

		customerRepo.save(customer)
	}

	@Test
	fun deleteCustomer(){
		customerRepo.deleteById(7)
	}

	@Test
	fun testFindByName() = customerRepo.findByName("Elias Phiri", PageRequest.of(0, 1, Sort.by("name"))).forEach { System.out.println(it) }

	@Test
	fun testFindByNameAndEmail(){
		var customers = customerRepo.findByNameAndEmail("Elias Phiri", "phirielias@gmail.com")
		customers.forEach{ System.out.println(it) }
	}

	@Test
	fun testFindByEmailLike(){
		var customers = customerRepo.findByEmailLike("%elias%")
		customers.forEach{ System.out.println(it) }
	}

	@Test
	fun testFindByIdIn(){
		var customers = customerRepo.findByIdIn(listOf(1,2,3,4))
		customers.forEach{ System.out.println(it) }
	}

	@Test
	fun testFindAllPaging() = customerRepo.findAll(PageRequest.of(0,2)).forEach{ System.out.println(it) }

	@Test
	fun testFindAllSorting() = customerRepo.findAll(Sort.by( "name", "email")).forEach{ System.out.println(it) }

	@Test
	fun testFindAllPagingAndSorting() = customerRepo.findAll(PageRequest.of(0,1, Sort.by("name"))).forEach{ System.out.println(it) }

	@Test
	@Transactional
	@Rollback(false)
	fun testUpdateEmailById() = customerRepo.updateEmailById(1, "phirielias@gmail.com")
}
