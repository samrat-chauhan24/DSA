import java.util.Scanner;
public class factorial {
    public void factorialn(int n, int fact){
        if(n==0||n==1){
            System.out.println(fact);
            return;
    
        }
        
        factorialn(n-1, fact = fact*n);
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number : ");
            int n = sc.nextInt();
            factorial print = new factorial();
            print.factorialn(n, 1);
        }

    }

    
}
