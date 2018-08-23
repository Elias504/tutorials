package com.springdatajpa.filedata.repositories

import com.springdatajpa.filedata.entities.Image
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ImageRepository: JpaRepository<Image, Long>