/*
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".

Example 2:
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

Example 3:
Input: s = ""
Output: 0
 
Constraints:
0 <= s.length <= 3 * 104
s[i] is '(', or ')'.
*/

// class Solution {
//     public int longestValidParentheses(String s) {
//        int maxlen = 0;
//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i + 2; j <= s.length(); j+=2) {
//                 if (isValid(s.substring(i, j))) {
//                     maxlen = Math.max(maxlen, j - i);
//                 }
//             }
//         }
//         return maxlen;
//     }
    
//     public boolean isValid(String s){
//         Stack<Character> stack = new Stack<Character>();
        
//         for(int i = 0; i<s.length(); i++){
//             if(s.charAt(i)=='('){
//                 //System.out.println("Push");
//                 stack.push('(');
//             }else if(!stack.empty() && stack.peek()=='('){
//                // System.out.println("pop");
//                 stack.pop();
//             }else
//                 return false;
//         }
//         //System.out.println(stack.empty());
//         return stack.empty();
//     }
// }

public class Solution {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }
}
