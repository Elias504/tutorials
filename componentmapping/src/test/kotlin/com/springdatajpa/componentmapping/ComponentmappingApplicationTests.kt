package com.springdatajpa.componentmapping

import com.springdatajpa.componentmapping.entities.Address
import com.springdatajpa.componentmapping.entities.Employee
import com.springdatajpa.componentmapping.repositories.EmployeeRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ComponentmappingApplicationTests {

	@Autowired
	lateinit var employeeRepository: EmployeeRepository

	@Test
	fun contextLoads() {
	}

	@Test
	fun createEmployee(){
		employeeRepository.save(Employee(
				name = "Elias Phiri",
				address = Address("1582/u Palm Drive, Chelstone", "Lusaka", "Lusaka", "10101", "Zambia")
		))
	}

}
