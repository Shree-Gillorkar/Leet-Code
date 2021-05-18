class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0, rev = 0, temp = x;
        while(temp!=0){
            rem = temp%10;
            temp/=10;
            rev = rev*10+rem;
        }
        if(x>=0 && rev == x)
            return true;
        else
            return false;
    }
}
