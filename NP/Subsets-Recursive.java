public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 6, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public ArrayList<ArrayList<Integer>> subsets(int[] num) {
        if(num == null)
            return null;
        Arrays.sort(num);
        return helper(num, num.length-1);
    }
    private ArrayList<ArrayList<Integer>> helper(int[] num, int index)
    {
        if(index == -1)
        {
            ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> elem = new ArrayList<Integer>();
            res.add(elem);
            return res;
        }
        ArrayList<ArrayList<Integer>> res = helper(num,index-1);
        int size = res.size();
        for(int i=0;i<size;i++)
        {
            ArrayList<Integer> elem = new ArrayList<Integer>(res.get(i));
            elem.add(num[index]);
            res.add(elem);
        }
        return res;
    }
}