package org.example.intv;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParantheses {

    static boolean isValidParentheses(String str) {
        //Stack<Character> stack = new Stack<>(); //thread safe and slow.
        Deque<Character> dequeStack = new ArrayDeque<>();//not thread safe and fast.
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') { //opening push to stack and continue
                dequeStack.push(c);
                continue;
            }

            if (dequeStack.isEmpty())//closing : and stack is empty: invalid
            {
                return false;
            }

            char top = dequeStack.pop();
            if ((c == '}' && top != '{') ||
                    (c == ']' && top != '[') ||
                    (c == ')' && top != '(')
            ) {
                return false;
            }

        }
        return dequeStack.isEmpty();
    }

    static void main(String[] args) {
        System.out.println("{}()[] is valid parentheses? :" + isValidParentheses("{}()[]"));
        System.out.println("{}() is valid parentheses? :" + isValidParentheses("{}()"));
        System.out.println("[{}()] is valid parentheses? :" + isValidParentheses("[{}()]"));
        System.out.println("{}()[]} is valid parentheses? :" + isValidParentheses("{}()[]}"));
    }
}
