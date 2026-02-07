import java.util.Scanner;
public class switchcase {
 
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int ch = 0;
            while(ch < 4){
            System.out.println("enter values for a & b:\n");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
      
    
            System.out.println("enter your choice:\n");
            System.out.println("1 for add:\n");
            System.out.println("2 for sub:\n");
            System.out.println("3 for mul:\n");
            
            int choice = scanner.nextInt();
   
                
            switch (choice) {
                case 1: System.out.println("sum is :" + a+b);
                break;
                case 2: int c = a-b;
                System.out.println("diff is :" + c  ); 
                break;
                case 3: System.out.println("product is :" + a*b);
                break;
                default:System.out.println("wrong choice");
                break;
            }
   ch++;}
        }

   

       

    }
    
}
