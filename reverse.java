class Solution {
public:
    int reverse(int x) {
        long result = 0, temp = x, rem;
        while(temp!=0){
            rem = temp%10;
            temp/=10;
            result = result *10 + rem;
            if(-2147483648 > result || result > 2147483647){
                return 0;
            }
        }
        return result;
    }
};
