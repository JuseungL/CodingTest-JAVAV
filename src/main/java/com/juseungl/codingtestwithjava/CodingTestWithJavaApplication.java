package com.juseungl.codingtestwithjava;

import com.juseungl.codingtestwithjava.BruteForce.*;
import com.juseungl.codingtestwithjava.ProgrammersHash.ProgrammersHash1;
import com.juseungl.codingtestwithjava.ProgrammersHash.ProgrammersHash2;
import com.juseungl.codingtestwithjava.ProgrammersHash.ProgrammersHash3;
import com.juseungl.codingtestwithjava.ProgrammersHash.ProgrammersHash4;
import com.juseungl.codingtestwithjava.ProgrammersHeap.ProgrammersHeap1;
import com.juseungl.codingtestwithjava.ProgrammersHeap.ProgrammersHeap2;
import com.juseungl.codingtestwithjava.ProgrammersHeap.ProgrammersHeap3;
import com.juseungl.codingtestwithjava.StackQueue.*;
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

        ProgrammersStackQueue3 programmersStackQueue3 = new ProgrammersStackQueue3();
        String s = "(())";
        programmersStackQueue3.solution(s);

        ProgrammersStackQueue4 programmersStackQueue4 = new ProgrammersStackQueue4();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        programmersStackQueue4.solution(priorities, location);

        ProgrammersStackQueue6 programmersStackQueue6 = new ProgrammersStackQueue6();
        int[] prices = {1, 2, 3, 2, 3};
        programmersStackQueue6.solution(prices);

        ProgrammersHeap1 programmersHeap1 = new ProgrammersHeap1();
        int[] scovile = {1, 2, 3, 9, 10, 12};
        int k = 7;
        programmersHeap1.solution(scovile, k);

        ProgrammersHeap2 programmersHeap2 = new ProgrammersHeap2();
        int[][] jobs = { {0, 3}, {1, 9}, {2, 6} };
        programmersHeap2.solution(jobs);

        ProgrammersHeap3 programmersHeap3 = new ProgrammersHeap3();
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        programmersHeap3.solution(operations);

        ProgrammersHash1 programmersHash1 = new ProgrammersHash1();
        int[] nums = {3,3,3,2,2,4};
        programmersHash1.solution(nums);

        ProgrammersHash2 programmersHash2 = new ProgrammersHash2();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        programmersHash2.solution(participant, completion);

        ProgrammersHash3 programmersHash3 = new ProgrammersHash3();
        String[] phone_book = {"119", "97674223", "1195524421"};
        programmersHash3.solution(phone_book);

        ProgrammersHash4 programmersHash4 = new ProgrammersHash4();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        programmersHash4.solution(clothes);

        ProgrammersBF1 programmersBF1 = new ProgrammersBF1();
        int[][] sizes = { {60, 50}, {30, 70}, {60, 30}, {80, 40} };
        programmersBF1.solution(sizes);

        ProgrammersBF2 programmersBF2 = new ProgrammersBF2();
        int[] answers = {1,3,2,4,2};
        programmersBF2.solution(answers);

        ProgrammersBF3 programmersBF3 = new ProgrammersBF3();
        String numbers = "17";
        programmersBF3.solution(numbers);

        ProgrammersBF4 programmersBF4 = new ProgrammersBF4();
        int brown = 24;
        int yellow = 24;
        programmersBF4.solution(brown,yellow);

        ProgrammersBF5 programmersBF5 = new ProgrammersBF5();
        int k5 = 80;
        int[][] dungenous = {{80,20},{50,40},{30,10}};
        programmersBF5.solution(k5,dungenous);

    }
}
