class Solution {
    
    public boolean isUgly(int n) {
        if(n==0)
            return false;
        n = maxDivide(n , 2);
        n = maxDivide(n , 3);
        n = maxDivide(n , 5);
        
        if(n==1) 
            return true; 
        else
            return false;
    }
    
    int maxDivide(int a, int b)
    {
        while (a % b == 0)
             a = a / b;
        return a;
    }
}
