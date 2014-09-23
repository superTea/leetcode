/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 12, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<Interval> merge(List<Interval> intervals) {
        ArrayList<Interval> returnList = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0){
            return returnList;
        }
        
        Comparator<Interval> comparator = new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2){
                if(i1.start == i2.start){
                    return i1.end - i2.end;
                }
                return i1.start - i2.start;
            }
        };
        
        Collections.sort(intervals,comparator); //sort(List<T> list, Comparator<? super T> c) Sorts the specified list according to the order induced by the specified comparator. 
        
        returnList.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++){
            if(returnList.get(returnList.size()-1).end >= intervals.get(i).start){
                returnList.get(returnList.size()-1).end = Math.max(returnList.get(returnList.size()-1).end, intervals.get(i).end);
            }else{
                returnList.add(intervals.get(i));
            }
        }
        
        return returnList;
    }
}