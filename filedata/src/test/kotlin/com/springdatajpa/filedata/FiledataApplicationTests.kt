package com.springdatajpa.filedata

import com.springdatajpa.filedata.entities.Image
import com.springdatajpa.filedata.repositories.ImageRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.core.io.ResourceLoader
import org.springframework.test.context.junit4.SpringRunner
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

@RunWith(SpringRunner::class)
@SpringBootTest
class FiledataApplicationTests {

	@Autowired
	lateinit var imageRepository: ImageRepository

	@Test
	fun contextLoads() {
	}

	@Test
	fun testFileSave(){
		var file = File("C:\\Users\\Elias-Work\\Documents\\GitHub\\tutorials\\filedata\\src\\main\\resources\\mac_setup.jpg")
		var fileContent = ByteArray(file.length().toInt())
		var inputStream = FileInputStream(file)

		inputStream.read(fileContent)

		imageRepository.save(Image(name = "Mac Setup", data = fileContent))

		inputStream.close()
	}

	@Test
	fun testFileRead(){
		var image = imageRepository.findById(11).get()
		var file = File("C:\\Users\\Elias-Work\\Downloads\\" + image.name)
		var fileOutputStream = FileOutputStream(file)

		fileOutputStream.write(image.data)

		fileOutputStream.close()
	}

}
