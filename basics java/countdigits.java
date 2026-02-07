import java.util.Scanner;
public class countdigits {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter your number:");
                int n = scanner.nextInt();
                int s = n;
                int digit = 0;
                int r = 0;
                while(n>0){
                    digit = n%10;
                    r = r*10 + digit;
                    n=n/10;
                    if(n==0){
                        break;
                    }
                }
                if (r==s) {
                    System.out.println("number is palindrome : " + r);
                }
                else{
                    System.out.println("not palindrome");
                }
        }
         
            

        }
    
}

