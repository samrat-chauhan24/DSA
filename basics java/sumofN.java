import java.util.Scanner;
public class sumofN{
    public void sumofn(int n, int sum){
        
        if(n==0){
            System.out.println(sum);
            return;
        }
        
        sumofn(n-1, sum = n + sum);
}
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        sumofN print = new sumofN();
        print.sumofn(n, 0);
    }
}
}