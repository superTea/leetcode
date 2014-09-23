public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 21, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                array[0] = map.get(target - numbers[i]) + 1;
                array[1] = i + 1;
            }
            map.put(numbers[i], i);
        }
        
        return array;
    }
}