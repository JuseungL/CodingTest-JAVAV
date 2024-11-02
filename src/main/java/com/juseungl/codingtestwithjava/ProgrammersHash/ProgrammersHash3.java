package com.juseungl.codingtestwithjava.ProgrammersHash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgrammersHash3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i=0;i<phone_book.length-1;i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return answer;
    }
}
