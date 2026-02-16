package stringEasy;

public class IsomorphicString {
    static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        int arrOfS[] = new int[256]; // for all chars
        int arrOfT[] = new int[256];
        for(int i = 0; i < s.length(); i++){
            if(arrOfS[s.charAt(i)] != arrOfT[t.charAt(i)]) return false;// if any char is updated before it will give false, it wasn't added with same char
            arrOfS[s.charAt(i)] =  i + 1;
            arrOfT[t.charAt(i)] =  i + 1;
        }
        return true;
    }
    public static void main(String[] args) {
    
        boolean ans = isIsomorphic("papaper", "titttle");
        System.out.println(ans);
    }
}
