package com.juseungl.codingtestwithjava.BfsDfs;

public class ProgrammersDfs1 {
    static int answer = 0;

    public void dfs(int now, int idx, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (now == target) answer ++;
            return;
        }
        int nextIndx = idx + 1;
        dfs(now+numbers[idx], nextIndx, numbers, target);
        dfs(now-numbers[idx], nextIndx, numbers, target);
    }

    public int solution(int[] numbers, int target) {

        dfs(numbers[0],1, numbers, target);
        dfs(-numbers[0],1, numbers, target);
        return answer;
    }
}
