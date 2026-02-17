package stringEasy;
public class ReverseWords {
    static String reverseWords(String s){
        String str[] = s.split(" ");
        int l = 0,  r = str.length-1;
        while(l<r){
            String temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++; r--;
        }
        String a = String.join(" ",str);
        a = a.trim().replaceAll("\\s+"," "); 
        return a;
    }
    public static void main(String[] args) {
        String ans = reverseWords("samrat    rajput    chauhan ");
        System.out.println(ans);
        
    }
}
// for(int i = 0; i<n/2; i++){
//             String temp = str[i];
//             str[i] = str[n-1-i];
//             str[n-1-i] = temp;    
//         }