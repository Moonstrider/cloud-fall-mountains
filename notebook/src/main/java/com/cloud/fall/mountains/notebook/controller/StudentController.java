package com.cloud.fall.mountains.notebook.controller;

import com.cloud.fall.mountains.notebook.service.StudentService;
import com.cloud.fall.mountains.notebook.entity.cassandra.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostConstruct
    public void saveStudents() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(
                1001,
                "John Doe",
                18,
                1,
                "Delaware",
                Set.of("basketball", "swimming"),
                List.of("12345678901", "98765432109"),
                Map.of("high", "xinge", "colleague", "donghua")
        );
        students.add(student1);
        students.add(new Student(
                1002,
                "Adam Smith",
                24,
                1,
                "North Carolina",
                Set.of("football", "swimming"),
                List.of("12345678901"),
                Map.of("high", "shanghai", "colleague", "BU")
        ));
        students.add(new Student(
                1003,
                "Kevin Dunner",
                30,
                1,
                "Virginia",
                Set.of("climbing"),
                List.of("12345678901"),
                Map.of("high", "xinzhuang", "colleague", "HU")
        ));
        studentService.initializeStudents(students);
    }

    @GetMapping("/list")
    public Flux<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{a}")
    public Mono<Student> getStudentById(@PathVariable(value = "a") String a) {
        System.out.println("rob:" + a);
        return studentService.getStudentById(Integer.parseInt(a));
    }

    @GetMapping("/filter-by-age/{age}")
    public Flux<Student> getStudentsFilterByAge(@PathVariable(value = "age") int age) {
        return studentService.getStudentsFilterByAge(age);
    }
}
