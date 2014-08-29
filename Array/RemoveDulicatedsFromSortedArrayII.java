public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Aug 28, 2014
     * @platform LeetCode OJ
     * 
     */
     
    public int removeDuplicates(int[] A) {
        if (A.length <= 2)
        	return A.length;
        
        int index = 2;
		int prev = 1; // point to previous
		int curr = 2; // point to current
 
		while (curr < A.length) {
			if (A[curr] == A[prev] && A[curr] == A[prev - 1]) {
				curr++;
			} else {
				prev++;
				A[index++] = A[curr++];
			}
		}
 
		return index;
    }
}