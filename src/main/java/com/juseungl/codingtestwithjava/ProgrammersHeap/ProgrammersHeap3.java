package com.juseungl.codingtestwithjava.ProgrammersHeap;

import java.util.*;

public class ProgrammersHeap3 {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최솟값을 관리하는 우선순위 큐

        for (String operation : operations) {
            if (operation.charAt(0) == 'I') {
                // 숫자 삽입
                int value = Integer.parseInt(operation.substring(2));
                pq.offer(value);
            } else if (operation.charAt(0) == 'D') {
                if (pq.isEmpty()) continue; // 큐가 비어있으면 삭제 명령을 무시

                if (operation.charAt(2) == '1') { // 최댓값 삭제
                    /**
                     * 우선순위 큐에서 최댓값 제거 시 임시 ArrayList를 통해 최대값을 찾고 remove(value)로 삭제!
                     */
                    List<Integer> temp = new ArrayList<>(pq);
                    int maxValue = Collections.max(temp);
                    pq.remove(maxValue);
                } else { // 최솟값 삭제
                    pq.poll(); // 기본적으로 우선순위 큐는 최솟값을 poll()로 제거
                }
            }
        }
        if (pq.isEmpty()) {
            return new int[2];
        }

        // 비어 있지 않으면 최댓값과 최솟값 설정
        if (!pq.isEmpty()) {
            answer[1] = pq.peek(); // 최솟값
            // 큐를 리스트로 변환해서 최대값을 찾아 설정
            answer[0] = Collections.max(new ArrayList<>(pq)); // 최댓값
        }

        return answer;
    }
}
