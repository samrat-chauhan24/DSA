package recursionJava;

public class CountGoodNums {
    static final long mod = 1_000_000_007;
    static int countGoodNums(long n){
        // handle some base cases
        if(n==0) return 0;
        if(n==1) return 5;
        // as this question must be done in O(logn)
        // first find the number of odd and even indices
        long even = (n+1)/2; // 5+1 = 6/2 -> 3 means 0,2,4
        long odd = n/2; // defalut gives the base value 5/2 -> 2 means 1,3
        long evenPow = calculatePow(5, even);
        long oddPow = calculatePow(4,odd);
        return (int) ((evenPow * oddPow) % mod);
    }
    static long calculatePow(int base, long exponent){
        if(exponent == 0) return 1;
        long halfOfResult = calculatePow(base, exponent/2);
        long result = (halfOfResult * halfOfResult) % mod;
        if(exponent % 2 == 1){
            result = (result * base) % mod;
        }
        return result;
    }
}