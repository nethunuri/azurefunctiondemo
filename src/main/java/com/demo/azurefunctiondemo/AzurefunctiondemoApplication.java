package com.demo.azurefunctiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzurefunctiondemoApplication {

    @GetMapping("/message")
   public String message(){
       return "Congrats !!  This is Azure function Demo Application";
   }
    public static void main(String[] args) {
        SpringApplication.run(AzurefunctiondemoApplication.class, args);
    }

}
