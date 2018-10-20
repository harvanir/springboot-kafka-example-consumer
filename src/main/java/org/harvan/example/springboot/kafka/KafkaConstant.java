/*
 * Copyright 2018-2018 the original author or authors.
 */

package org.harvan.example.springboot.kafka;

/**
 * @author Harvan Irsyadi
 * @version 1.0.0
 * @since 1.0.0 (2 Jun 2018)
 */
public class KafkaConstant {
    private static final String GROUP_PREFIX = "-group";

    static final String TOPIC = "request-topic";

    static final String TOPIC_GROUP = TOPIC + GROUP_PREFIX;

    private KafkaConstant() {
    }
}