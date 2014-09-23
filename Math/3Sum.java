public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 21, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<Integer>> threeSum(int[] num) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(num==null || num.length<=2)  
            return returnList;  
        Arrays.sort(num);
        for(int i = num.length - 1; i  >=  2; i--){
            if(i < num.length - 1 && num[i] == num[i + 1]){
                continue;
            }
            ArrayList<List<Integer>> curList = twoSum(num, i - 1, -num[i]);
            for(int j = 0; j < curList.size(); j++){
                curList.get(j).add(num[i]);
            }
            returnList.addAll(curList);
        }
        
        return returnList;
    }
    
    public ArrayList<List<Integer>> twoSum(int[] num, int end, int target){
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(num==null || num.length<=1)  
            return returnList;  
        int l = 0;
        int r = end;
        while(r > l){
            if(num[l] + num[r] == target){
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(num[l]);
                list.add(num[r]);
                returnList.add(list);
                l++;
                r--;
                while(l < r && num[l] == num[l - 1]){
                    l++;
                }
                while(l < r  && num[r] == num[r + 1]){
                    r--;
                }
            }else if(num[l] + num[r] > target){
                r--;
            }else{
                l++;
            }
        }
        
        return returnList;
    }
}