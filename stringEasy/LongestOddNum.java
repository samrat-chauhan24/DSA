package stringEasy;

public class LongestOddNum {
    static String longestOdd(String s){
        
        String maxStr = "";
        for(int i = 0; i<s.length(); i++){
            String curr = "";
            if(s.charAt(i)%2==0) continue;
            if(s.charAt(i)%2!=0){
                curr = s.substring(0,i+1);
            }
            if(curr.length()>maxStr.length()){
                maxStr = curr;
            }
        }
        return maxStr;
    }
    public static void main(String[] args) {
        String nums = "25769";
        String ans = longestOdd(nums);
        System.out.println(ans);
    }
}
