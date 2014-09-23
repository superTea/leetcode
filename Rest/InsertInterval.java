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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> returnList = new ArrayList<Interval>();
        for(Interval interval: intervals){
            if(interval.end < newInterval.start){
                returnList.add(interval);
            }else if(interval.start > newInterval.end){
                returnList.add(newInterval);
                newInterval = interval; 
            }else if(interval.end >= newInterval.start || interval.start <= newInterval.end){
                newInterval = new Interval(Math.min(interval.start, newInterval.start), Math.max(interval.end, newInterval.end));
            }
        }
        returnList.add(newInterval);
        return returnList;
        
    }
}