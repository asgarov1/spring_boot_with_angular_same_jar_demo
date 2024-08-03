package com.asgarov.backend_frontend_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class BackendFrontendDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendFrontendDemoApplication.class, args);
    }

}
