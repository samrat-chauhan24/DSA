import java.util.Scanner;
public class fibonacci {
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        return a+b;
    }
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the number of terms : ");
        int n = sc.nextInt();
//    fibonacci ans = new fibonacci();
//    System.out.println(ans.fib(n));
//    for(int i = 0; i<n; i++){
//         System.out.println("->"+ans.fib(i) +"");
//    }
int ans = fib(n);
System.out.println(ans);
for(int i =0; i<n; i++){
    System.out.println(fib(i));
}
}
}}

