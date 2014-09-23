public class Solution {
    /**
     * 
     * @author superTea
     * @Date Sep 11, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0){
            return null;
        }
        if(b == null || b.length() == 0){
            return null;
        }
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        int carry = 0;
        StringBuilder str = new StringBuilder();
        while(i >= 0 && j >= 0){
            int digit = (int)(a.charAt(i) - '0' + b.charAt(j) - '0') + carry;
            carry = digit / 2;
            digit = digit % 2;
            str.append(digit);
            i--;
            j--;
        }
        
        while(i >= 0){
            int digit = (int)(a.charAt(i) - '0') + carry;
            carry = digit / 2;
            digit = digit % 2;
            str.append(digit);
            i--;
        }
        
        while(j >= 0){
            int digit = (int)(b.charAt(j) - '0') + carry;
            carry = digit / 2;
            digit = digit % 2;
            str.append(digit);
            j--;
        }
        
        if(carry > 0){
            str.append('1');
        }
        
        return str.reverse().toString();
        
    }
}