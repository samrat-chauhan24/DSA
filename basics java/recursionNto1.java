import java.util.Scanner;
public class recursionNto1 {
    public void printNum(int N){
        if(0==N){
            return;
        }
        System.out.println(N);
        printNum(N-1);
    }
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the vlaue of N : ");
           int N = sc.nextInt();
           recursionNto1 print = new recursionNto1();
           print.printNum(N);
       } 
    }
}
