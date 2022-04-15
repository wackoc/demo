package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author mosonglin  2022/4/15 11:32
 */
@SpringBootApplication(scanBasePackages = {"org.example"})
@EnableElasticsearchRepositories(basePackages = "org.example.infra.es")
public class ElasticsearchDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchDemoApplication.class, args);
    }
}
