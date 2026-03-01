package recursionJava;
import java.util.ArrayList;
import java.util.List;
public class GenerateParenthesis {
    // brute force
    static List<String> generateParenthesis(int n){
        List<String> listOfParen = new ArrayList<>();
        helper("", n, listOfParen);
        return listOfParen;
    }
    static void helper(String curr, int n, List<String> listOfParen){
        // base condition
        if(curr.length() == 2 * n){
            if(isValidParen(curr)){
                listOfParen.add(curr);
            }
            return;
        }
        helper(curr + "(", n, listOfParen);
        helper(curr + ")", n, listOfParen);
    }
    static boolean isValidParen(String s){
        int countOfParen = 0;
        for(char ch: s.toCharArray()){
            if(ch == '(') countOfParen++;
            else countOfParen--;
            if(countOfParen<0) return false;
        }
        return countOfParen == 0;
    }
    // optimal solution
    static List<String> OptiGenParen(int n){
        List<String> result = new ArrayList<>();
        generateParen(result, "", n, n);
        return result;
    }
    static void generateParen(List<String> result, String curr, int open, int close){
        // base condition
        if(open == 0 && close == 0){
            result.add(curr);
            return;
        }
        if(open>0){
            generateParen(result, curr + "(", open - 1, close);
        }
        if(close > open){
            generateParen(result, curr + ")", open, close - 1);
        }
    }
}
