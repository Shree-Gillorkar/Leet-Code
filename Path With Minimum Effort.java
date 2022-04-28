/*
You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns, where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.
A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
Return the minimum effort required to travel from the top-left cell to the bottom-right cell.

Example 1:
Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
Output: 2
Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 in consecutive cells.
This is better than the route of [1,2,2,2,5], where the maximum absolute difference is 3.

Example 2:
Input: heights = [[1,2,3],[3,8,4],[5,3,5]]
Output: 1
Explanation: The route of [1,2,3,4,5] has a maximum absolute difference of 1 in consecutive cells, which is better than route [1,3,5,3,5].

Example 3:
Input: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
Output: 0
Explanation: This route does not require any effort.
 
Constraints:
rows == heights.length
columns == heights[i].length
1 <= rows, columns <= 100
1 <= heights[i][j] <= 106
*/

class Solution {
   public int minimumEffortPath(int[][] arr) {
int n=arr.length,m=arr[0].length;
boolean [][]visited=new boolean[n][m];
Queue<int[]>q=new PriorityQueue<>((a,b)->a[2]-b[2]);
q.add(new int[]{0,0,0});

    while(q.size()>0){
        int[] t=q.poll();
        int r=t[0],c=t[1];
        if(visited[r][c]==false){
            if(r==n-1&&c==m-1)return t[2];
            visited[r][c]=true;
            if(r>0)q.add(new int[]{r-1,c,Math.max(t[2],Math.abs(arr[r-1][c]-arr[r][c]))});
            if(r<n-1)q.add(new int[]{r+1,c,Math.max(t[2],Math.abs(arr[r+1][c]-arr[r][c]))});
            if(c>0)q.add(new int[]{r,c-1,Math.max(t[2],Math.abs(arr[r][c-1]-arr[r][c]))});
            if(c<m-1)q.add(new int[]{r,c+1,Math.max(t[2],Math.abs(arr[r][c+1]-arr[r][c]))});
        }
    }
    return 0;
}
}
