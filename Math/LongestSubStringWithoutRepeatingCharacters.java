/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 * 
 * @see https://oj.leetcode.com/problems/longest-substring-without-repeating-characters/
 * @author superTea
 * @date Sep 22, 2014
 * @platform LeetCode OJ
 */
public class Solution {
    
    /**
     * Find the length of longest substring
     * 
     * @param String, the input string
     * @return int, length of longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int runner = 0;
        int walker = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(runner < s.length()){
            if(set.contains(s.charAt(runner))){
                if(max < runner - walker){
                    max = runner - walker;
                }
                while(s.charAt(walker) != s.charAt(runner)){
                    set.remove(s.charAt(walker));
                    walker++;
                }
                walker++;
            }else{
                set.add(s.charAt(runner));
            }
            runner++;
        }
        max = Math.max(max, runner - walker);
        return max;
    }
}