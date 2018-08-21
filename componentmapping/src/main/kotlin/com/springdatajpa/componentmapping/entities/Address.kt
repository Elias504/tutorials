package com.springdatajpa.componentmapping.entities

import javax.persistence.Embeddable

@Embeddable
data class Address (
        var streetAddress: String = "",
        var city: String = "",
        var state: String = "",
        var zipCode: String = "",
        var country: String = ""
)