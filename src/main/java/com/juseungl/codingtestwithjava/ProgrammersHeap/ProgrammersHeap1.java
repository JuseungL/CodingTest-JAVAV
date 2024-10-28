package com.juseungl.codingtestwithjava.ProgrammersHeap;

import java.util.PriorityQueue;

public class ProgrammersHeap1 {
    public int solution(int[] scovile, int K) {
        int answer = 0;
        /**
         * 매번 가장 스코빌 지수가 낮은 음식과 두번째로 낮은 음식을 섞어야함
         * -> PriorityQueue
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int sc:scovile) {
            pq.add(sc);
        }


        while (pq.size() >= 2) {
            if (pq.peek() >= K) return answer;
            Integer first = pq.poll();
            Integer second = pq.poll();
            int mixed = first + (second * 2);
            answer += 1;
            pq.add(mixed);
        }

        if (pq.size() == 1) {
            if (pq.peek() >= K) return answer;
            else return -1;
        }

        for (int p:pq) {
            System.out.println(p);
        }
        System.out.println(answer);

        return -1;
    }
}
