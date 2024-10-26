package com.juseungl.codingtestwithjava.StackQueue;

import java.util.*;

public class ProgrammersStackQueue2 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        // 배포까지 필요한 날짜 Queue에 담기
        for (int i = 0; i < progresses.length; i++) {
            // 필요한 날짜를 속도로 나눈 나머지가 0이면 당일 배포 가능
            if ((100 - progresses[i]) % speeds[i] == 0) {
                q.offer((100 - progresses[i]) / speeds[i]);
            } else { // 나머지가 0이 아니면 다음날 배포해야 함
                q.offer(((100 - progresses[i]) / speeds[i]) + 1);
            }
        }
        // 첫 번째 기능 배포 날짜
        int now = q.poll();
        int count = 1;

        // queue가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 현재 배포 날짜가 queue의 다음 기능의 배포날짜보다 크면 추가
            if (now >= q.peek()) {
                count++;
                q.poll();
            } else { // 현재 배포 날짜가 queue의 다음 기능 날짜보다 작으면
                answer.add(count); // count answer에 담기
                count = 1; // count 초기화
                now = q.poll(); // 다음 배포날짜
            }
        }
        answer.add(count); // 마지막 count 담기
        for (int a:answer) {
            System.out.println(a);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
