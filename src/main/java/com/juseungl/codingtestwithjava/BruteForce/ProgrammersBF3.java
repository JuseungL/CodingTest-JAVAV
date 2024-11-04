package com.juseungl.codingtestwithjava.BruteForce;
import java.util.*;

public class ProgrammersBF3 {
    static HashSet<Integer> combSet = new HashSet<>();
    public void recur(String comb, String other) {
        if (!comb.equals("")) combSet.add(Integer.valueOf(comb));

        for (int i=0;i<other.length();i++) {
            recur(comb + other.charAt(i), other.substring(0,i)+other.substring(i+1));
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int solution(String numbers) {
        int answer = 0;
        recur("", numbers);

//        for (Integer comb:combSet) {
//            if (isPrime(comb)) answer += 1;
//        }

        Iterator<Integer> iter = combSet.iterator(); // 반복자
        while (iter.hasNext()) { // 다음 요소가 있니?
            int number = iter.next(); // 다음 요소가 있다면 그 다음 요소를 변수에 담아줘
            if (!isPrime(number)) answer++;
        }
        return answer;
    }
}
