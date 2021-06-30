/*Since 3 is a prime number, any power of 3 will only be divisible by any power of 3 that is equal or smaller. We can use this to our advantage by taking the largest possible power of 3 within our constraints (3^19) and performing a modulo n operation on it. If the result is a 0, then n is a power of 3.*/

class Solution {
    public boolean isPowerOfThree(int n) {
          return n > 0 && 1162261467 % n == 0;
    }
}

/*
We can take advantage of the natural mathematical properties of logarithms to find our solution. If n is a power of 3, then 3^x = n. This can be rewritten as log3 n = x, where x will be an integer if n is a power of 3.

Since most programming languages can't natively do log3 calculations, we can take advantage of another property of logarithms: log3 n can be rewritten as log n / log 3. This will produce a slight amount of floating point error, but any value that is within a close margin (1e-10) while n is constrained to an int will be a correct.*/

class Solution {
    public boolean isPowerOfThree(int n) {
        double a = Math.log(n) / Math.log(3);
        return Math.abs(a - Math.round(a)) < 1e-10;
    }
}
