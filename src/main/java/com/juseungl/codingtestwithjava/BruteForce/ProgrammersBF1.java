package com.juseungl.codingtestwithjava.BruteForce;

import java.util.Arrays;
import java.util.Collections;

public class ProgrammersBF1 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int h = 0;
        // Math.max() and Math.min()활용하기
        for (int[] size:sizes) {
            Arrays.sort(size);
            if (w < size[0]) {
                w = size[0];
            }
            if (h < size[1]) {
                h = size[1];
            }
        }
        answer = w * h;
        return answer;
    }
}
