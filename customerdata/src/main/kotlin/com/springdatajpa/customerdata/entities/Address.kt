package com.springdatajpa.customerdata.entities

import javax.persistence.Embeddable


@Embeddable
class Address(
        var streetAddress: String = "",
        var city: String = "",
        var state: String = "",
        var zipCode: String = "",
        var country: String = ""
)