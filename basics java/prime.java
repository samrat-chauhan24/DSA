import java.util.Scanner;
public class prime {
    public static int primenumber(int n1){
        int count = 0;
    
        for(int i = 1; i <= n1; i++){
            if(n1 % i ==0){
            count++;
        }
        }
        
    
    return count;
}
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
        System.out.print("enter your number to be checked : ");
        int n1 = sc.nextInt();
        int ans = primenumber(n1);
        if(ans==2){
            System.out.println("number is prime");

        }
        else{
            System.out.println("not prime");
        }
         
        
       }

    }
}
