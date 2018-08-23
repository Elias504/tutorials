package com.springdatajpa.filedata.entities

import java.io.Serializable
import javax.persistence.*

@Entity
@Table
class Image(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var name: String = "",
        @Lob
        var data: ByteArray? = null
): Serializable