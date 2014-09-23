public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 17, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String multiply(String num1, String num2) {
        if(num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0){
            return "";
        }
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        
        int[] d = new int[num1.length() + num2.length()];
        for(int i = 0; i < num1.length(); i++){
            int a = num1.charAt(i) - '0';
            for(int j = 0; j < num2.length(); j++){
                int b = num2.charAt(j) - '0';
                d[i + j] += a * b;
            }
        }
        
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < d.length; i++){
            int digit = d[i] % 10;
            int carry = d[i] / 10;
            str.insert(0, digit);
            if(i < d.length - 1){
                d[i + 1] += carry;
            }
        }
        
        while(str.length() > 0 && str.charAt(0) == '0'){
            str.deleteCharAt(0);
        }
        
        return str.length() == 0 ? "0":str.toString();
        
    }
}