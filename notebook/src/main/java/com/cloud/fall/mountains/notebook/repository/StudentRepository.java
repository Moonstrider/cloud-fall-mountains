package com.cloud.fall.mountains.notebook.repository;

import com.cloud.fall.mountains.notebook.entity.cassandra.Student;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Flux;


public interface StudentRepository extends ReactiveCassandraRepository<Student, Integer> {
    @AllowFiltering
    Flux<Student> findByAgeGreaterThan(int age);
}

//public interface StudentRepository extends CassandraRepository<Student, Integer> {
//    @AllowFiltering
//    List<Student> findByAgeGreaterThan(int age);
//
//    List<Student> findByName(String name);
//}