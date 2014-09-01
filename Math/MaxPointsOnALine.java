/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if(points.length == 0 || points == null){
            return 0;
        }
        int max = 1;
        double ratio = 0.0;
        for(int i = 0; i< points.length; i++){
            HashMap<Double, Integer> map = new HashMap<Double, Integer>();
            int samePoints = 0; 
            int localMax = 1;
            for(int j = i+1; j < points.length; j++){
                if(points[i].x == points[j].x && points[i].y == points[j].y){
                    samePoints++;
                    continue;
                }else if(points[i].x == points[j].x){
                    ratio = (double) Integer.MAX_VALUE;
                }else if(points[i].y == points[j].y){
                    ratio = 0.0;
                }else{
                    ratio = (double) (points[j].y-points[i].y) / (double) (points[j].x - points[i].x);
                }
                
                if(map.containsKey(ratio)){
                    int value = map.get(ratio);
                    map.put(ratio, value+1);
                }else{
                    map.put(ratio,2);
                }
            }
            for(Integer value : map.values()){
                localMax = Math.max(value, localMax);
            }
            localMax += samePoints;
            max = Math.max(max, localMax);            
        }
        return max;
    }
}