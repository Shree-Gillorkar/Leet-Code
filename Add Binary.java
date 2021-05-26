class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int len_a = a.length()-1;
        int len_b = b.length()-1;
        int carry = 0;
        
        while(len_a>=0 || len_b>=0){
            int sum = carry;
            if(len_a>=0) sum += a.charAt(len_a)-'0';
            if(len_b>=0) sum += b.charAt(len_b)-'0';
            sb.append(sum%2);
            carry = sum/2;
            
            
            len_a--;
            len_b--;
            
        }
        if(carry!=0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
