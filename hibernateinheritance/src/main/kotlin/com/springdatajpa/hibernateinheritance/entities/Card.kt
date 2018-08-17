package com.springdatajpa.hibernateinheritance.entities

import javax.persistence.*

@Entity
@PrimaryKeyJoinColumn(name = "payment_id")
data class Card(
        override val id: Long = -1,
        override var amount: Double = 0.00,
        var cardNumber: String? = null
): Payment(id, amount)