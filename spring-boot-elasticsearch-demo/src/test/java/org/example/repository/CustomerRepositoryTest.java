package org.example.repository;

import java.util.List;
import javax.annotation.Resource;
import org.example.ElasticsearchDemoApplication;
import org.example.infra.es.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author mosonglin  2022/4/15 11:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElasticsearchDemoApplication.class)
public class CustomerRepositoryTest {

    @Resource
    CustomerRepository customerRepository;

    @Test
    public void test_findByName() {
        List<Customer> zhangsan = customerRepository.findByName("zhangsan");
        zhangsan.forEach(customer -> System.out.println(customer.getId()));
    }
}
