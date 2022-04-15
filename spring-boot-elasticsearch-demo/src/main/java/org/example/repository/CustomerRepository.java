package org.example.repository;

import java.util.List;
import org.example.infra.es.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mosonglin  2022/4/15 11:40
 */
@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

    /**
     * findBy 后面跟表达式
     * @return
     */
    List<Customer> findByName(String name);

}
