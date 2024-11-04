package com.juseungl.codingtestwithjava.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersBF4 {
    /**
     * yellow의 가능한 조합을 찾고 그거에 brown이 적합한지 검사
     */
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        List<int[]> comb = new ArrayList<>();
        for (int i=1;i<=Math.sqrt(yellow);i++) {
            if (yellow%i==0) {
                comb.add(new int[] {i, yellow/i});
            }
        }

        for (int[] c:comb) {
            int brownPredict = (Arrays.stream(c).sum() * 2) + 4;
            if (brownPredict == brown) {
                return new int[] {c[1]+2, c[0]+2};
            }
        }

        return answer;
    }
}
