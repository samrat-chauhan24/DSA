import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter no of rows for pattern:");
            int n = scanner.nextInt();
            for(int i = 0; i<= n-1; i++){
                for(int s = n-1-i; s>0; s--){
                    System.out.print(" ");
                }
                for(int j = 1; j<= 2*i+1; j++){
                    System.out.print("*");
                }
                for(int s = n-1-i; s>0; s--){
                    System.out.print(" ");
                }
            System.out.println();
            }
            for(int i = 0; i<=n-1; i++){
                for(int s = 0; s<i;  s++){
                    System.out.print(" ");
                }
                for(int j = 0; j< 2*n - (2*i+1)  ; j++ ){
                System.out.print("*");
                }
                for(int s = 0; s<i;  s++){
                    System.out.print(" ");
                }
            System.out.println();
            }
        }
        
    }
}
    


