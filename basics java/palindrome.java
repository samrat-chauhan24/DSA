import java.util.Scanner;
public class palindrome {
    public static boolean ispalindrome(String s, int l, int r){
       
        if(l>=r){
            return true;
        }           
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return ispalindrome(s, l+1, r-1);
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your string : ");
            String s = sc.nextLine();
            s = s.toLowerCase();//constraints
            s = s.replaceAll("[^a-z0-9]","");//constraints 
            boolean a = ispalindrome(s, 0, s.length()-1);
            if(a){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindiorme");
            }
        }


    }
}
