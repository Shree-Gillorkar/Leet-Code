/*Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

 

Example 1:


Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]
 

Constraints:

1 <= n <= 20*/

class Solution {
    public int[][] generateMatrix(int n) {
        int c1 = 0, c2 = n-1;
        int r1 = 0, r2 = n-1;
        
        int[][] res = new int[n][n];
        int val = 1;
        
        while(r1<=r2 && c1<=c2){
            //fill 1st row
            for(int c = c1; c<=c2; c++)
                res[r1][c] = val++;
            
            //fill last col
            for(int r = r1+1; r<=r2; r++)
                res[r][c2] = val++;
            
            if(r1<r2 && c1<c2){
               //fill last row
               for(int c = c2-1; c>c1; c--)
                   res[r2][c] = val++;
            
               //fill 1st col again
               for(int r = r2; r>r1; r--)
                   res[r][c1] = val++;     
            }  
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return res;
    }
}
