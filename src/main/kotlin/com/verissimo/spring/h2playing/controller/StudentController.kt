package com.verissimo.spring.h2playing.controller

import com.verissimo.spring.h2playing.repository.StudentRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController(
    val studentRepository: StudentRepository
) {

  @GetMapping("/list-all")
  fun getAll() = studentRepository.findAll()

}