import java.util.Scanner;

public class gcd {
    public static int findGCD(int n1, int n2){
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1,n2); i++){
           if(n1 % i == 0 && n2 % i == 0){
            gcd = i;
           }
        }
     return gcd;
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter n1 :");
            int n1 = sc.nextInt();
            System.out.print("enter n2 : ");
            int n2 = sc.nextInt();
            int gcd = findGCD(n1, n2);
            System.out.println("gcd is : "+gcd);
        }
    }

    
}
