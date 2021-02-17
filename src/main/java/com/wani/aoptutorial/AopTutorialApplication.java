package com.wani.aoptutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.wani.aoptutorial.filter")
@EnableAspectJAutoProxy
public class AopTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopTutorialApplication.class, args);
    }

}
