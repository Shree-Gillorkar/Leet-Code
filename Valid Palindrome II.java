/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false
 
Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.
*/


/* solution 1: 
Time Complexity :- BigO(N)
Space Complexity :- BigO(1)
*/

class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        boolean flag = true ;
        for(int i =0, j = n-1; i<n/2; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                 if(check3(s, i, j-1) || check3(s, i+1, j)){
                     //System.out.println(check3(s, i+1, j));
                     //System.out.println(check3(s, i, j--));
                       return true;
                 }else{
                     return false;
                 }
            }
        }
        return flag;
    }
    
     public static boolean check3(String str, int x, int y){
         //System.out.println(x+"-"+y);
         int n = str.length();
          for(x=x, y=y; x<y; x++, y--){
            if(str.charAt(x)!=str.charAt(y)){
                return false;
            }
        }
         return true;
     }
}

//solution 2 : using stringbuilder
class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        boolean flag = true ;
        for(int i =0, j = n-1; i<n/2; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                flag =  check2(s, i, j);
                break;
            }
        }
        return flag;
    }

    //check when string is not palindrome
    public static boolean check2(String s, int i, int j){
        int n = s.length()-1;
        StringBuilder stri = new StringBuilder(s);
        StringBuilder strj = new StringBuilder(s);
        
        String str1= stri.deleteCharAt(i).toString();
        String str2= strj.deleteCharAt(j).toString();
        
        if(check3(str1) || check3(str2)){
            return true;
        }else{
            return false;
        }
    }
    
    // check by removing char
     public static boolean check3(String str){
         int n = str.length();
          for(int x =0,y = n-1; x<y; x++, y--){
            if(str.charAt(x)!=str.charAt(y)){
                return false;
            }
        }
         return true;
     }
}
