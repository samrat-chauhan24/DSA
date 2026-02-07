import java.util.Scanner;
public class divisors {
    public static  int[] printdiv(int n1){
        
        int count = 0;
        for(int i = 1; i <= n1; i++){
            if(n1%i == 0){
                count++;
            }
        }
        int arr[] = new int[count];
        int index = 0;
        for(int i = 1; i <= n1; i++){
           if(n1%i==0){
            arr[index] = i;
            index++;
           } 
        }
    
    return arr;
}
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter your number : ");
          int n1 = sc.nextInt();
          int b[] = printdiv(n1);
          
          for(int i = 0; i< b.length; i++){
            System.out.println("list of divisors : " + b[i]);
          }
      }


    }
}
