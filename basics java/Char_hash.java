import java.util.Scanner;
public class Char_hash {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your string : ");
            String str = sc.next();
            int hash[] = new int [26];
            for(int i = 0; i<str.length();i++){
                hash[str.charAt(i) - 'a']++;
            }
            for(int i :hash){
                if(i!=0) {
                System.out.print(  i + " ");
                }
            }
        }

        
    }
}
