package com.hainet.spring.boot.external.config.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootExternalConfigSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExternalConfigSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(
            @Value("${key}") final String keyValue,
            @Value("${internal-key}") final String internalKeyValue,
            @Value("${external-key}") final String externalKeyValue) {
        return args -> {
            System.out.println("key: " + keyValue);
            System.out.println("internal-key: " + internalKeyValue);
            System.out.println("external-ley: " + externalKeyValue);
        };
    }
}
