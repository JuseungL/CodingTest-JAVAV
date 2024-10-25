package com.juseungl.codingtestwithjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingTestWithJavaApplication {

    public static void main(String[] args) {

        SpringApplication.run(CodingTestWithJavaApplication.class, args);

        ProgrammersStackQueue programmersStackQueue = new ProgrammersStackQueue();
        int[] arr = {1,1,3,3,0,1,1};
        programmersStackQueue.question1(arr);
    }

}
