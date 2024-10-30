package com.juseungl.codingtestwithjava.ProgrammersHash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProgrammersHash1 {
    public int solution(int[] nums) {
        int pick = nums.length / 2;

        Set<Integer> set = new HashSet<>();

        for (int num:nums) {
            set.add(num);
        }

        if (pick <= set.size()) {
            return pick;
        } else {
            return set.size();
        }
    }
}
