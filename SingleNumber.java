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