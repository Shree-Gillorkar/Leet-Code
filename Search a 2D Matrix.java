/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 
Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
*/ 

public static int targetRow(int[][]matrix, int target){
        int low = 0;
        int high = matrix.length-1;
        int lc = matrix[0].length-1;
        
        int mid;
        
        while(low<=high){
            mid = (low+high)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][lc]){
                return mid;
            }else if(target>matrix[mid][lc]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    
    public static boolean search(int[][]matrix, int r, int target){
        int arr[] = new int[matrix[r].length];
        
        int f = 0, l = matrix[r].length, mid;
        
        while(f<=l){
            mid = (f+l)/2;
            if(target==matrix[r][mid]){
                return true;
            }else if(target>matrix[r][mid]){
                f = mid+1;
            }else{
                l = mid-1;
            }
        }
        return false;
    }
