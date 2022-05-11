/*
Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

Example 1:
Input: n = 1
Output: 5
Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].

Example 2:
Input: n = 2
Output: 15
Explanation: The 15 sorted strings that consist of vowels only are
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.

Example 3:
Input: n = 33
Output: 66045

Constraints:
1 <= n <= 50 
*/

class Solution {
    public int countVowelStrings(int n) {
        int ans = 0;
        
        ans += nCm(n - 1, 4);
        ans += (nCm(n - 1, 3) * 5);
        ans += (nCm(n - 1, 2) * 10);
        ans += (nCm(n - 1, 1) * 10);
        ans += 5;
        
        return ans;
    }
    
    public int nCm(int n, int m){
        if(m > n) return 0;
        
        long num = 1;
        long den = 1;
        
        while(m > 0){
            num *= n;
            den *= m;
            n--;
            m--;
        }
        
        return (int) (num / den);
    }
}
