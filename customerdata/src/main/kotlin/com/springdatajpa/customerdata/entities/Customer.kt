package com.springdatajpa.customerdata.entities

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer (
        @Id
        // @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var name: String = "",
        var email: String = ""
){
        override fun toString(): String = "{id: $id, name: $name, email: $email}"
}