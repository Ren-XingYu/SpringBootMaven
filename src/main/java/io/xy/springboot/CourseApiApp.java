package io.xy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
    public static void main(String[] args) {
        /**
         * 1、Sets up default configuration
         * 2、Starts Spring application context
         * 3、Performs class path scan
         * 4、Starts Tomcat Server
         */
        SpringApplication.run(CourseApiApp.class,args);
    }
}
