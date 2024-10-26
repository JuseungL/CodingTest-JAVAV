package com.juseungl.codingtestwithjava.StackQueue;
import java.util.*;
public class ProgrammersStackQueue1 {
    public int[] solution(int []arr) {

        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i : arr) {
            if (st.peek() != i) {
                st.push(i);
            }
        }
//        ArrayList보다 Stack 사이즈를 통해 배열로 구현하는 것이 더 효과적
        int stSize = st.size();
        int[] answer = new int[stSize];
        int k = stSize - 1;
        while(!st.isEmpty()){
            answer[k--] = st.pop();
        }
        return answer;
//        List<Integer> answer = new ArrayList<>();
//        while (!st.isEmpty()) {
//            answer.add(st.pop());
//        }
//        Collections.reverse(answer);
//        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


}