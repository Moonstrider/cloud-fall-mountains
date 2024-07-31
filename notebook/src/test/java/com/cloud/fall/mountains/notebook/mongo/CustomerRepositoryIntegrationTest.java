package com.cloud.fall.mountains.notebook.mongo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

@DataMongoTest
class CustomerRepositoryIntegrationTest {

    @Autowired
    CustomerRepository customerRepository;
    private Customer dave, oliver, carter;

    @BeforeEach
    void setUp() {
        customerRepository.deleteAll();

        dave = customerRepository.save(new Customer("Dave", "Matthews"));
        oliver = customerRepository.save(new Customer("Oliver August", "Matthews"));
        carter = customerRepository.save(new Customer("Carter", "Beauford"));
    }

    /**
     * Test case to show that automatically generated ids are assigned to the domain objects.
     */
    @Test
    void setsIdOnSave() {

        var dave = customerRepository.save(new Customer("Dave", "Matthews"));
        assertThat(dave.getId()).isNotNull();
        Customer customer = customerRepository.findById(dave.getId()).get();
        System.out.println(customer);
    }

    @Test
    void findCustomersUsingQuerydslSort() {
        var result = customerRepository.findByLastname("Matthews");

        assertThat(result.size()).isEqualTo(2);
        assertThat(result.get(0)).isEqualTo(dave);
        assertThat(result.get(1)).isEqualTo(oliver);
    }

}

