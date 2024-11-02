package com.juseungl.codingtestwithjava.BruteForce;

public class ProgrammersBF2 {
//    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};
        int questionSize = answers.length;

        supoja1 = Math.abs(supoja1.length / questionSize) * supoja1 + supoja1[0:(supoja1.length % questionSize)];

        return answer;
    }
}
