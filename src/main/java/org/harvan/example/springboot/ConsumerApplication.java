/*
 * Copyright 2018-2018 the original author or authors.
 */

package org.harvan.example.springboot;

import org.harvan.example.springboot.kafka.KafkaConsumerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @author Harvan Irsyadi
 * @version 1.0.0
 * @since 1.0.0 (2 Jun 2018)
 */
@EnableKafka
@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[]{ConsumerApplication.class}, args);
    }
}