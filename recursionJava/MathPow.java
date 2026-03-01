package recursionJava;

public class MathPow{
    static double myPow(double x, int n){
        if(n==0) return 1;
        long N = n;
        if(N<0){
            x = 1/x;
            N = -N;
        }
        return helpMyPow(x, N);
    }
    static double helpMyPow(double x, long n){
        if(n==0) return 1;
        double halfOfRes = helpMyPow(x, n/2);
        if(n % 2 == 0) return halfOfRes * halfOfRes;
        else return halfOfRes * halfOfRes * x;// if the power is odd
    }
}