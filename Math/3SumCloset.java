public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 22, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int threeSumClosest(int[] num, int target) {
        if(num == null || num.length < 2){
            return Integer.MIN_VALUE;
        }
        Arrays.sort(num);
        int closet = num[0] + num[1] + num[2] - target;
        for(int i = 0; i < num.length - 2; i++){
            int compare = twoSum(num, target - num[i], i + 1);
            if(Math.abs(compare) < Math.abs(closet)){
                closet = compare;
            }
        }
        return target + closet;
    }
    
    public int twoSum(int[] num, int target, int start){
        int closet = num[start] + num[start + 1] - target;
        int l = start;
        int r = num.length - 1;
        while(l < r){
            if(num[l] + num[r] == target){
                return 0;
            }
            int compare = num[l] + num[r] - target;
            if(Math.abs(compare) < Math.abs(closet)){
                closet = compare;
            }
            if(num[l] + num[r] > target){
                r--;
            }else{
                l++;
            }
        }
        
        return closet;
    }
}