package stringEasy;
import java.util.Arrays;
public class LargestPrefix {
    static String largestCommonPre(String strings[] ){
        StringBuilder ans = new StringBuilder();// to use append
        Arrays.sort(strings); // to sort the strings

        String first = strings[0], last = strings[strings.length-1]; // taking shortest and longest strings

        for(int i = 0; i< Math.min(first.length(),last.length()); i++){
            if(first.charAt(i) != last.charAt(i)) return ans.toString();// if first and last have somthing in commom it will store till the common chars and return whenever they mismatches
            ans.append(first.charAt(i)); // adds the common to ans
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String strings[] = {"sa","sam","samrat"};
        String ans = largestCommonPre(strings);
        System.out.println(ans);
    }
}
