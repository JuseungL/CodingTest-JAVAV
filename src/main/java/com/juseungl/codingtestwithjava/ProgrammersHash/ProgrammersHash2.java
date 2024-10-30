package com.juseungl.codingtestwithjava.ProgrammersHash;

import java.util.LinkedList;

public class ProgrammersHash2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        LinkedList<String> participants = new LinkedList<>();
        for (String p:participant) {
            participants.add(p);
        }

        for (String c: completion) {
            participants.remove(c);
        }
//        System.out.println(participants.pop());
        return participants.pop();
    }
}
