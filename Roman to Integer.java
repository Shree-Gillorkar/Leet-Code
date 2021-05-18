class Solution {
    public int value(char x){
        if(x=='I')
            return 1;
        if(x=='V')
           return 5;
        if(x=='X')
           return 10;
        if(x=='L')
            return 50;
        if(x=='C')
            return 100;
        if(x=='D')
           return 500;
        if(x=='M')
           return 1000;
        return -1;
           
   }
   public int romanToInt(String s) {
         int result = 0;
        for(int i =0; i<s.length();i++){
            int s1 = value(s.charAt(i));
            
            if(i+1<s.length()){
                int s2 = value(s.charAt(i+1));
                if(s1>=s2){
                    result = result + s1;
                }else{
                    result = result + s2 - s1 ;
                    i++;
                }
                 System.out.println(s1+" "+s2);
            }
            else{
                result = result + s1;
            }
        }
        return result;
    }
}
