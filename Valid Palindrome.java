class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^a-zA-Z0-9]",""); 
        //System.out.println(s);  
        s=s.toLowerCase();
        String reverS = checkPalindrome(s);
        System.out.println(s);
        System.out.println(reverS);
        if(reverS.equals(s))
            return true;
        else
            return false;
        
    }
    
    String checkPalindrome(String s){
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1.reverse();
        return input1.toString();
    }
}
