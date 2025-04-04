package com.leocg.easy;

import com.leobas.impresion.Impresion;

import java.util.Stack;

import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        imprimirTitulo("Valid Parenthesis");
        Impresion.impresionNormal("Input: " + s);

        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!((top == '(' && c == ')') ||
                        (top == '{' && c == '}') ||
                        (top == '[' && c == ']'))) {
                    return false;
                }
            }
        }

        Impresion.impresionNormal("Output: ");
        return stack.isEmpty();
/*
        if(s == null || s.length() < 2){
            return false;
        }

        Stack stack = new Stack();

        int i = 0;
        boolean valid = true;
        while(i < s.length() && valid){
            if((i == 0 || stack.isEmpty()) && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                valid = false;
            }else if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(i > 0){
                int j = i;
                while(j > 0 && j < s.length() && !stack.isEmpty() && valid){
                    char top = (char) stack.peek();
                    if(top == '(' && s.charAt(j) == ')' ){
                        stack.pop();
                    } else if(top == '{' && s.charAt(j) == '}' ){
                        stack.pop();
                    } else if(top == '[' && s.charAt(j) == ']' ){
                        stack.pop();
                    }else{
                        valid = false;
                    }
                    j++;
                }
            }else {
                valid = false;
            }
            i++;
        }

        Impresion.impresionNormal("Output: ");
        return stack.isEmpty() && valid;

 */
    }
}
