package stringMedium;

public class LongestPalindrome {
    static String longestPalindrome(String s){
        if(s.length()==0)return "";
        int maxLenghtOfStr = 0;
        int lenOfCurrStr = 0;
        String subString = "";
        for(int i = 0; i < s.length(); i++){
            lenOfCurrStr = 0;
            for (int j = i; j < s.length(); j++) {
                if(isPalindrome(s, i, j)){
                lenOfCurrStr = j-i+1;
                if (lenOfCurrStr>maxLenghtOfStr) {
                    maxLenghtOfStr = lenOfCurrStr;
                    subString = s.substring(i,j + 1);
                }
                }
            }
        }
        return subString;
    }
    static boolean isPalindrome(String s, int i, int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalindrome(s, i+1, j-1);
    }
    public static void main(String[] args) {
        String s  = "cbbbbd";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
}
