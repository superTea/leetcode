public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 21, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String intToRoman(int num) {
        if(num < 1 || num > 3999){
            return "";
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuilder str = new StringBuilder();
        int digit = 1000;
        while(digit > 0){
            list.add(num / digit);
            num %= digit;
            digit /= 10;
        }
        str.append(convert(list.get(0), 'M', ' ', ' '));
        str.append(convert(list.get(1), 'C', 'D', 'M'));
        str.append(convert(list.get(2), 'X', 'L', 'C'));
        str.append(convert(list.get(3), 'I', 'V', 'X'));
        return str.toString();
    }
    
    public String convert(int num, char one, char five, char ten){
        StringBuilder str = new StringBuilder();
        switch(num){
            case 9:
                str.append(one);
                str.append(ten);
                break;
            case 8:
            case 7:
            case 6:
            case 5:
                str.append(five);
                for(int i = 5; i < num; i++){
                    str.append(one);
                }
                break;
            case 4:
                str.append(one);
                str.append(five);
                break;
            case 3:
            case 2:
            case 1:
                for(int i = 0; i < num; i++){
                    str.append(one);
                }
                break;
            default:
                break;
        }
        return str.toString();
    }
}