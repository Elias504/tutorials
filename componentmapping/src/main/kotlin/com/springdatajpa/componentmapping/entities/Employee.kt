package com.springdatajpa.componentmapping.entities

import javax.persistence.*

@Entity
data class Employee (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var name: String = "",
        @Embedded
        var address: Address? = null
)