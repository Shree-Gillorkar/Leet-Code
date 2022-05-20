/*
You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m-1][n-1]). The robot can only move either down or right at any point in time.
An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
The testcases are generated so that the answer will be less than or equal to 2 * 109.

Example 1:
Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right

Example 2:
Input: obstacleGrid = [[0,1],[0,0]]
Output: 1
 
Constraints:
m == obstacleGrid.length
n == obstacleGrid[i].length
1 <= m, n <= 100
obstacleGrid[i][j] is 0 or 1.
*/

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] res = new int[row][col];
        
        boolean flag = false;
        
        for(int i =0; i<col; i++){
            if(flag || obstacleGrid[0][i]==1){
                flag = true;
                res[0][i] = 0;
            }else{
                res[0][i] = 1;
            }
        }
        
        flag = false;
        
        for(int i = 0; i<row; i++){
            if(flag || obstacleGrid[i][0]==1){
                flag = true;
                res[i][0] = 0;
            }else{
                res[i][0] = 1;
            }
        }
        
        for(int i = 1; i<row; i++){
            for(int j = 1; j<col; j++){
                if(obstacleGrid[i][j]==1){
                    res[i][j] = 0;
                }else{
                    res[i][j] = res[i][j-1] + res[i-1][j];
                }
            }
        }
        
        // for(int i = 0; i<row; i++){
        //     for(int j = 0; j<col; j++){
        //         System.out.print(res[i][j]);
        //     }
        //     System.out.println();
        // }
        
        return res[row-1][col-1];
    }
}
