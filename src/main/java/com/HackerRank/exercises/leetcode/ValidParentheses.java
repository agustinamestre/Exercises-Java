package com.HackerRank.exercises.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        var s = "([])";
        ValidParentheses validParentheses = new ValidParentheses();
        var resultado = validParentheses.isValid(s);
        System.out.println(resultado);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> characters = new HashMap<>();
        characters.put('(', ')');
        characters.put('[', ']');
        characters.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            if (characters.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    if (s.charAt(i) != characters.get(stack.peek())){
                        return false;
                    } else {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
