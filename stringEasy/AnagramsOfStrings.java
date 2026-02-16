package stringEasy;

public class AnagramsOfStrings {
    static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int countArr[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            countArr[s.charAt(i) - 'a']++;// adds one at every char of s
            countArr[t.charAt(i) - 'a']--;// deletes that one if t is same
        }
        // this String.charAt fetches the char at i and - 'a' extracts its address from 26 chars; and these sqaure brackets converrts them into number index
        
        for(int i: countArr){
            if(i != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "sam", t = "mas";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }
}
