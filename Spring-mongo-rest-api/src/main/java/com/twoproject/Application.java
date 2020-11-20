package com.twoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories // burda mongo db repositorylerini devreye al dedik
public class Application {

    public static void main(String args[]){
        SpringApplication.run(Application.class,args);
    }
}
