package com.cloudfall.mountains.notebook.service;

import com.cloudfall.mountains.notebook.entity.cassandra.Student;
import com.cloudfall.mountains.notebook.repository.StudentRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void initializeStudents(List<Student> studentList) {
        Flux<Student> savedStudents = studentRepository.saveAll(studentList);
        savedStudents.subscribe();
//        studentRepository.saveAll(studentList);
    }

    public Flux<Student> getAllStudents() {
        return studentRepository.findAll();

    }

    public Flux<Student> getStudentsFilterByAge(int age) {
        return studentRepository.findByAgeGreaterThan(age);
    }

    public Mono<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }
}
