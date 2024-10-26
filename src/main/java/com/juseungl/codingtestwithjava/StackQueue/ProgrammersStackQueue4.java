package com.juseungl.codingtestwithjava.StackQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class ProgrammersStackQueue4 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        /**
         * 우선 무조건 가장 큰 것 부터 시작
         * 우선 순위 큐(Priority Queue)
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : priorities) {
            pq.add(p);
        }

        while (!pq.isEmpty()) {
            for (int i=0;i<priorities.length;i++) {
                if (priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;
                    if (i == location) return answer;
                }
            }
        }
        return answer;
    }
}
