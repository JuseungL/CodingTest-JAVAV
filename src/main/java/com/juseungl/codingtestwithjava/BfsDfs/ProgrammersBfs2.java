package com.juseungl.codingtestwithjava.BfsDfs;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersBfs2 {

    public void bfs() {

    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
//        Boolean[] visited = new Boolean[n]; // 기본 값 Null
        boolean[] visited = new boolean[n]; // 기본 값 false

        List<List<Integer>> graph = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>()); // 각 노드에 빈 리스트 추가
        }

        for (int i = 0; i < n; i++) {
            int[] computer = computers[0];
            for (int c:computer) {
//                if (c==1 && )
            }

        }

        return answer;
    }
}
