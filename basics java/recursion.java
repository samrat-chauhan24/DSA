import java.util.Scanner;
public class recursion{
    public void printName(String name, int count, int n1){
        if(count==n1){
            return;
        }
        System.out.println(name);
        printName(name, count+1, n1);
    }
public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the no of recursive calls :");
        int n1 = sc.nextInt();
        System.out.print("enter the string :");
        String name = sc.next();
        recursion print = new recursion();
        print.printName(name, 0, n1);
    }
}
}
