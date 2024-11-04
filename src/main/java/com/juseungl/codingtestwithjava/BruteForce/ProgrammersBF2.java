package com.juseungl.codingtestwithjava.BruteForce;

import java.util.*;

public class ProgrammersBF2 {
//    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
    public int[] solution(int[] answers) {
        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};
        int questionSize = answers.length;

        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(1, 0);
        hm.put(2, 0);
        hm.put(3, 0);

        for (int i = 0; i < questionSize; i++) {
            if (supoja1[i % supoja1.length] == answers[i]) hm.put(1, hm.get(1) + 1);
            if (supoja2[i % supoja2.length] == answers[i]) hm.put(2, hm.get(2) + 1);
            if (supoja3[i % supoja3.length] == answers[i]) hm.put(3, hm.get(3) + 1);
        }

        // 최댓값 찾기
        int maxScore = Collections.max(hm.values());
        List<Integer> winners = new ArrayList<>();

        // map의 각 키-값 쌍에 접근
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == maxScore) {
                winners.add(entry.getKey());
            }
        }

        int[] answer = winners.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
