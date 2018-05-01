package com.example.application.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.example.application.spring.repository")
@ComponentScan({"com.example.application.startup", "com.example.application.spring"})
public class ApplicationConfiguration {

}
