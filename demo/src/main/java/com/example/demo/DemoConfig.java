package com.example.demo;

import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRepositoryFtpImpl;
import com.example.demo.repository.UserRepositoryS3Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // источник установок
public class DemoConfig {



    @Bean (name = "ftp")//
    UserRepository getFtpStorage(){
        return new UserRepositoryFtpImpl();
    }

    @Bean (name = "s3")//
    UserRepository getS3Storage(){
        return new UserRepositoryS3Impl();
    }
}
