package stringMedium;

public class NestingOfParenthesis {
    static int maxDepth(String s){
        int currDepth = 0;
        int max_depth = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)==')') currDepth--;
            if(s.charAt(i)=='(') {currDepth++;
            max_depth = Math.max(max_depth, currDepth);}
        }
        
        return max_depth;
    }
    public static void main(String[] args) {
        String s = "()(())(((()())))";
        int ans = maxDepth(s);
        System.out.println(ans);
    }
}
