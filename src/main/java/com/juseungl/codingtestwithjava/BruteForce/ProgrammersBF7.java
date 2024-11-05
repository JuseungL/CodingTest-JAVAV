package com.juseungl.codingtestwithjava.BruteForce;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersBF7 {
    private static final char[] chars = {'A','E','I','O','U'};

    public void recur(String prod, List<String> dict) {
        dict.add(prod);

        if (prod.length()==5) return;

        for (char c : chars) {
            recur(prod+c, dict);
        }


    }
    public int solution(String word) {
        int answer = 0;
        List<String> dict = new ArrayList<>();
        recur("", dict);

        return dict.indexOf(word);
    }
}
