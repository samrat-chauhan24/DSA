package recursionJava;

public class MathPow {
    static double mathPow(double x, int n){
        double result = 1;
        // if n negative convert in upon and than make n positive
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        // iterate from 0 to n, and multiply x to result at evry iteration
        for(int i = 0; i < n; i++){
            result = result * x;
        }
        return result;
    }
    static double myPow(double x, long n) {
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        return x;
    }
    static double helpPow(double x, long n){
        if(n==0) return 1;
        double half = helpPow(x, n/2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
