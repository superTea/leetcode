public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 21, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        for(int i = num.length - 1; i > 2; i--){
            if(i == num.length - 1 || num[i] != num[i + 1]){
                ArrayList<List<Integer>> curList = threeSum(num, i - 1, target-num[i]);
                for(int j = 0; j < curList.size(); j++){
                    curList.get(j).add(num[i]);
                }
                returnList.addAll(curList);
                }
        }
        
        return returnList;
    }
    
    public ArrayList<List<Integer>> threeSum(int[] num, int end, int target){
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        for(int i = end; i >= 2; i--){
            if(i == end || num[i] != num[i + 1]){
                ArrayList<List<Integer>> curList = twoSum(num, i - 1, target-num[i]);
                for(int j = 0; j < curList.size(); j++){
                    curList.get(j).add(num[i]);
                }
            
                returnList.addAll(curList);
            }
        }
        
        return returnList;
    }
    
    public ArrayList<List<Integer>> twoSum(int[] num, int end, int target){
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        int l = 0;
        int r = end;
        while(l < r){
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
                while(l < r && num[r] == num[r + 1]){
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