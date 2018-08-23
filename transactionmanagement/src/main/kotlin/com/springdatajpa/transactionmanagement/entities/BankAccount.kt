package com.springdatajpa.transactionmanagement.entities

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "bank_account")
data class BankAccount(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var accountNumber: String = "",
        var firstName: String = "",
        var lastName: String = "",
        var balance: Double = 0.00
): Serializable
{
    @Override
    override fun toString(): String = "{id: $id, accountNumber: $accountNumber, firstName: $firstName, lastName: $lastName, balance: $balance}"
}