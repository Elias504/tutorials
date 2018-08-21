package com.springdatajpa.hibernateinheritance.entities

import javax.persistence.*

@Entity
@PrimaryKeyJoinColumn(name = "id")
data class Card(
        override var amount: Double = 0.00,
        var cardNumber: String? = null
): Payment(amount = amount)