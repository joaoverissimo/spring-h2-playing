package com.verissimo.spring.h2playing

import com.verissimo.spring.h2playing.entity.Student
import com.verissimo.spring.h2playing.repository.StudentRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SpringH2playingApplicationTests{

	@Autowired
	lateinit var studentRepository: StudentRepository

	@Test
	fun insertStudent() {
		studentRepository.save(Student(name = "Verissimo"))
	}

}
