package com.cloud.fall.mountains.notebook.mongo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    List<Customer> findByLastname(String lastname);

}
