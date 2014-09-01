public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0 || tokens == null){
            return 0;
        }
        
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                int num = stack.pop() + stack.pop();
                stack.push(num);
            }else if(tokens[i].equals("-")){
                int num = -stack.pop() + stack.pop();
                stack.push(num);
            }else if(tokens[i].equals("*")){
                int num = stack.pop() * stack.pop();
                stack.push(num);
            }else if(tokens[i].equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int num = num2/num1;
                stack.push(num);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return stack.pop();
    }
}