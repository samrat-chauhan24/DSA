package recursionJava;

public class CountGoodNums {
    static final long mod = 1_000_000_007;
    static int countGoodNums(long n){
        long even = (n+1)/2;
        long odd = n/2;
        long evenPow = power(5, even);
        long oddPow = power(4, odd);
        return (int) ((evenPow * oddPow) % mod);
    }
    static long power(long base, long exp){
        if(exp == 0) return 1;
        
        long half = power(base, exp/2);
        long result = (half * half) % mod;
        if(exp % 2 == 1){
            result = (result * base) % mod;
        }
        return result;
    }
}
