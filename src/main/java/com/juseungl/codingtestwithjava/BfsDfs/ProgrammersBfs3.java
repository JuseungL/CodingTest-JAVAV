package com.juseungl.codingtestwithjava.BfsDfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProgrammersBfs3 {
    /**
     * DFS를 사용하게 되면 모든 경우의 수를 고려해서 최단거리를 고려해야함으로
     * BFS가 유리하다고 판단된다.
     */
    public class Node {
        int y;
        int x;
        int cnt;

        public Node(int y, int x, int cnt) {
            this.y = y;
            this.x = x;
            this.cnt = cnt;
        }

        public boolean canMove(int y, int x, int[][] maps) {
            return y >= 0 && y < visited.length && x >= 0 && x < visited[0].length && !visited[y][x] && maps[y][x] == 1;
        }
    }
    static int answer = 0;
    static boolean[][] visited;
    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,1,0,-1};

    public void bfs(int y, int x, int[][] maps) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0,0,1));
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Node now = q.poll();
            if (now.y == maps.length - 1 && now.x == maps[0].length - 1) {
                answer = now.cnt;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int ny = now.y + dy[i];
                int nx = now.x + dx[i];

                if (now.canMove(ny,nx,maps)) {
                    visited[ny][nx] = true;
                    q.add(new Node(ny,nx,now.cnt + 1));
                }
            }
        }

        answer = -1;
    }
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];

        bfs(0,0,maps);
        return answer;
    }
}

