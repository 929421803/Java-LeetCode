package com.wanghy.test.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author ：WangHY
 * @date ：Created in 10:34 2019/5/7
 * @Description：
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {
        public static boolean isValid(String s) {
            Map map = new HashMap<>();
            map.put('}', '{');
            map.put(')', '(');
            map.put(']', '[');
            Stack stack = new Stack<>();
            for ( int i = 0; i < s.length(); i++) {
                if(s.charAt(i) =='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                    stack.push(s.charAt(i));
                }else if(map.containsKey(s.charAt(i))){
                    if(map.get(s.charAt(i))!=stack.pop() ){
                        return false;
                    }
                }else{
                    return false;
                }
            }
            return true;

        }
        public static void main(String[] args){
            boolean b = isValid("()");
        }
}
