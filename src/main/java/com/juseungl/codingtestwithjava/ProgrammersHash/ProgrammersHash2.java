package com.juseungl.codingtestwithjava.ProgrammersHash;

import java.util.*;

public class ProgrammersHash2 {
    public String solution(String[] participant, String[] completion) {
        /**
         * 결국 풀이는 HashMap을 통해 성공함.
         * 처음에 LinkedList에 추가하고 빼서 마지막 남는 참가자가 완주하지 못한 사람이라고 도출하는 방식은 시간초과 발생
         * HashMap vs. LinkedList 차이로 인해 발생
         * HashMap은 get, put, getOrDefault, remove, containsKey 등의 메소드는 O(1)의 상수 시간복잡도
         * 단, key가 아닌 Value를 이용한 탐색, containsValue 메소드의 경우,
         * Hash Function을 통해 index를 찾아 직접접근이 불가하기 때문에 O(n)의 시간복잡도를 갖게 된다.
         */
        String answer = "";
        HashMap<String,Integer> hm = new HashMap<>();

        // 완주자 배열을 순회하므로 O(n), put메소드는 O(1)
        for (String p:participant) {
            hm.put(p, hm.getOrDefault(p,0) + 1);
        }

        // 참가자 배열을 순회하므로 O(n), getOrDefault, put메소드는 O(1)
        for (String c:completion){
            hm.put(c,hm.get(c)-1);
        }

        for (String key:hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}
