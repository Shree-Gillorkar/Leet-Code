class Solution {
    public boolean isPerfectSquare(int num) {
        int first = 0;
        int last = num;
        
        while(last>=first){
            int mid = first + (last-first)/2;
            if(mid == 0 || mid<num/mid)
                first = mid+1;
            else if(mid == num/mid && num%mid == 0){
                return true;
            }else{
                last = mid -1;
            }
        }
        return false;
    }
}
