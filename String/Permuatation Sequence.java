public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 11, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String getPermutation(int n, int k) {
        if(n < 0){
            return null;
        }
        k--;
        StringBuilder str = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int factor = 1;
        for(int i = 2; i < n; i++){
            factor *= i;
        }
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        int round = n - 1;
        while(round >= 0){
            int index = k / factor;
            str.append(list.get(index));
            k %= factor;
            list.remove(index);
            if(round > 0){
                factor /= round;
            }
            round--;
        }
        return str.toString();
    }
}