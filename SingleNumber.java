    public class Solution {
    public int singleNumber(int[] A) {
        int returnNum = 0^A[0];
        for(int i= 1; i < A.length; i++){
            returnNum = returnNum ^ A[i];
        }
        return returnNum;
    }
}

    public int singleNumber(int[] A) {
        Set<Integer> newSet = new HashSet<Integer>();
        int returnNum;
        for(int i =0; i<A.length; i++){
            int num = A[i];
            if(newSet.contains(num)){
                newSet.remove(num);
            }else{
                newSet.add(num);
            }
        }
        Iterator iterator= newSet.iterator();
        while(iterator.hasNext()){
            returnNum= iterator.next();
        }
        return returnNum;
    }

