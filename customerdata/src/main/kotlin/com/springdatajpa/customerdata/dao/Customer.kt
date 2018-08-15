package com.springdatajpa.customerdata.dao

import javax.persistence.*

@Entity
@Table(name = "customer")
class Customer (
        @Id
        // @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var name: String = "",
        var email: String = ""
)