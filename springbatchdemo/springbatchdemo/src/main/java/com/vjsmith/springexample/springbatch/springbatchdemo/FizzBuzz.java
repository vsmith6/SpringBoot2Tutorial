package com.vjsmith.springexample.springbatch.springbatchdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzz{

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzz.class, args);
	}

    @Bean
    public CommandLineRunner run(){
        return args ->{
            for(int i=1;i<101;i++){
                String result = "";
                result += (i % 3) == 0 ? "Fizz" : "";
                result += (i % 5) == 0 ? "Buzz" : "";
                System.out.println(!result.isEmpty() ? result : i);
            }
        };
    }
}