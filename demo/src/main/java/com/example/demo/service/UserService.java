package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired// авто привязанный
    @Qualifier("ftp")
    UserRepository ftpRepository;

    @Autowired// авто привязанный
    @Qualifier("s3")
    UserRepository s3Repository;

    public boolean upload(String newUser) {
        var ftp = ftpRepository.upload(newUser);
        var s3 = s3Repository.upload(newUser);
        System.out.println(ftp);
        System.out.println(s3);
        return true;
    }
}
