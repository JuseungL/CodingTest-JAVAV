package com.juseungl.codingtestwithjava.ProgrammersHeap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProgrammersHeap2 {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int idx = 0;
        int len = jobs.length;

        // 작업의 소요시간 오름차순
        Queue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        // 작업 요청시점 오름차순
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        while (!pq.isEmpty() || idx < len) {
            // 현재 시간 보다 작거나 같은 요청시점을 큐에 추가
            while (idx < len && jobs[idx][0] <= time) {
                pq.offer(jobs[idx++]);
            }
            // 큐에 작업이 없다면
            if (pq.isEmpty()) {
                // 작업 요청시점이 가장 빠른 작업 추가
                time = jobs[idx][0];
            } else { // 큐에 작업이 있다면
                // 작업 소요시간이 가장 빠른 작업 수행
                int[] job = pq.poll();
                time += job[1];
                answer += time - job[0];
            }
        }

        return answer / len;
    }
}
