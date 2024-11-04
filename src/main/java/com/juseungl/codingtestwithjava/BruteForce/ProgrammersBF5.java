package com.juseungl.codingtestwithjava.BruteForce;

import java.util.*;

public class ProgrammersBF5 {
    static HashSet<List<int[]>> order = new HashSet<>();
    public void recur(List<int[]> comb, List<int[]> others) {

        if (others.isEmpty()) {
            order.add(new ArrayList<>(comb)); // comb의 현재 상태를 추가
            return;
        }

        for (int i = 0; i < others.size(); i++) {
            comb.add(others.get(i));

            // 새로운 others 생성
            List<int[]> newOthers = new ArrayList<>(others);
            newOthers.remove(i); // 현재 요소를 제거

            recur(comb, newOthers); // 재귀 호출

            // 마지막 요소를 다시 빼주기
            comb.remove(comb.size() - 1);
        }
    }

    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        List<int[]> dungeonList = new ArrayList<>(Arrays.asList(dungeons));

        List<int[]> combination = new ArrayList<>(dungeonList.size());

        recur(combination, dungeonList);

        for (List<int[]> combinationList : order) {
            int cnt = 0;
            int temp = k;
            for (int[] array : combinationList) {
                int atLeast = array[0];
                int consume = array[1];
                if (temp >= atLeast) {
                    temp -= consume;
                    cnt ++;
                } else {
                    break;
                }
            }

            if (cnt > answer) answer = cnt;
        }
        return answer;
    }
}
