package com.juseungl.codingtestwithjava;

import com.juseungl.codingtestwithjava.StackQueue.ProgrammersStackQueue1;
import com.juseungl.codingtestwithjava.StackQueue.ProgrammersStackQueue2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingTestWithJavaApplication {

    public static void main(String[] args) {

        SpringApplication.run(CodingTestWithJavaApplication.class, args);

        ProgrammersStackQueue1 programmersStackQueue1 = new ProgrammersStackQueue1();
        int[] arr = {1,1,3,3,0,1,1};
        programmersStackQueue1.solution(arr);

        ProgrammersStackQueue2 programmersStackQueue2 = new ProgrammersStackQueue2();
        int[] progresses = {93, 30, 55, 30};
        int[] speeds = {1, 30, 5, 5};
        programmersStackQueue2.solution(progresses, speeds);
    }

}
