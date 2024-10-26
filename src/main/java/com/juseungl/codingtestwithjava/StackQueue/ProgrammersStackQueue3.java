package com.juseungl.codingtestwithjava.StackQueue;

import java.util.Stack;

public class ProgrammersStackQueue3 {
    public boolean solution(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        char c0 = s.charAt(0);

        if (c0 == '(') {
            stack.push(c0);
        } else {
            return false;
        }

        int i = 1;
        while (i < length) {
            char ci = s.charAt(i);

            if (ci == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
            i++;
        }

        if (stack.isEmpty()) return true;
        return false;
    }
}
