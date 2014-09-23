public class Solution {
    
/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * @see https://oj.leetcode.com/problems/valid-parentheses/
 * @author superTea
 * @date Sep 21th, 2014
 * @platform LeetCode OJ
 */
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        LinkedList<Character> stack = new LinkedList<Character>();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                    break;
                default:
                    
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}