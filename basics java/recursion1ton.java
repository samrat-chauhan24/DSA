public class recursion1ton {
    public static void printnum(int n, int count){
        if(count==n+1){
           return;
        }
        System.out.println(count);
        printnum(n, count + 1);
    } 
    public static void main(String[] args) {
        printnum(10, 1);
    }
}
