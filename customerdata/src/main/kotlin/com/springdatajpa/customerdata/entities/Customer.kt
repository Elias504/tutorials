package com.springdatajpa.customerdata.entities

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var name: String = "",
        var email: String = "",
        var address: Address? = null
){
        override fun toString(): String = "{id: $id, name: $name, email: $email, streetAddress: ${address?.streetAddress}, city: ${address?.city}, state: ${address?.state}, zipCode: ${address?.zipCode}, country: ${address?.country}}"
}