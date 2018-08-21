package com.springdatajpa.hibernateinheritance.entities

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Payment(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        open val id: Long = -1,
        open var amount: Double = 0.00
)