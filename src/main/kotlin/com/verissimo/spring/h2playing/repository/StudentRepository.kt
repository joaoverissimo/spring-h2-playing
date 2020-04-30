package com.verissimo.spring.h2playing.repository

import com.verissimo.spring.h2playing.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long> {
}