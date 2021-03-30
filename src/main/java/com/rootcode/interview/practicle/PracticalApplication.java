package com.rootcode.interview.practicle;

import com.rootcode.interview.practicle.util.LogConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticalApplication {

    public static void main(String[] args) {
//        LogConfig.initLogging();
        SpringApplication.run(PracticalApplication.class, args);
    }

}
