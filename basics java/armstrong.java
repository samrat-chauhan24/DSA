import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your number : ");
            int n = sc.nextInt();
            int temp = n;
            int k = 0;
            while(temp>0){
                k++;
                temp = temp/10;
            }
            int sum = 0;
            temp = n;
            while(temp>0){
                int d = temp%10;
                sum = sum + (int)Math.pow(d, k);
                temp = temp/10;
            }
      if(sum==n){
            System.out.println("number is armstrong : " + sum);

      }
      else{
            System.out.println("not armstrong");
      }
        }
}}
