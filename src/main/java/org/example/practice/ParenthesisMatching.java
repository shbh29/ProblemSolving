package org.example.practice;

import java.util.EmptyStackException;
import java.util.Stack;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ParenthesisMatching {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Predicate<Character> pop = (Character c) -> {
            try {
                if (stack.peek() == c) {
                    stack.pop();
                    return true;
                } else {
                    return false;
                }
            } catch (EmptyStackException e) { return false; }
        };
        for(char c : s.toCharArray()) {
            switch(c) {
                case '(':
                case '[':
                case '{':
                    stack.push((char)c); break;
                case ')':
                    if (!pop.test('(')) {return false;}
                    break;
                case ']':
                    if (!pop.test(']')) {return false;}
                    break;
                case '}':
                    if (!pop.test('}')) {return false;}
                    break;
                default:
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        System.out.println("isValid: "+new ParenthesisMatching().isValid("(([[{}]]))"));
//        System.out.println("isValid: "+new ParenthesisMatching().isValid("(]"));
        System.out.println("isValid: "+new ParenthesisMatching().isValid("("));
    }
}
