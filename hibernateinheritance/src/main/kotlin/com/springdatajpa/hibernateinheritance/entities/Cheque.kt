package com.springdatajpa.hibernateinheritance.entities

import javax.persistence.*

@Entity
@PrimaryKeyJoinColumn(name = "id")
data class Cheque(
        override var amount: Double = 0.00,
        var chequeNumber: String? = null
): Payment(amount = amount)