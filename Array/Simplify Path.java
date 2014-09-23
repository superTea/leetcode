public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 9, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0){
            return null;
        }
        
        LinkedList<String> stack = new LinkedList<String>();
        StringBuilder str = new StringBuilder();
        int i = 0;
        
        while(i < path.length()){
            StringBuilder temp = new StringBuilder();
            int index = i;
            while(i < path.length() && path.charAt(i) != '/'){
                temp.append(path.charAt(i));
                i++;
            }
            
            if(index != i){
                String s = temp.toString();
                if(s.equals("..")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }else if(!s.equals(".")){
                    stack.push(s);
                }
            }
            i++;
        }
        
        if(!stack.isEmpty()){
            String[] array = stack.toArray(new String[stack.size()]);
            for(int j = array.length-1; j >= 0; j--){
                str.append('/' + array[j]);
            }
        }
        
        if(str.length() == 0){
            return "/";
        }
        
        return str.toString();
    }
}