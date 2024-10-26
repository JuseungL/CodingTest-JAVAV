package com.juseungl.codingtestwithjava.StackQueue;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProgrammersStackQueue6 {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];

        for (int i = 0; i<len; i++) {
            int cnt = 0;
            for (int j=i+1;j<len;j++) {
                cnt++;
                if (prices[j]<prices[i]) break;
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
