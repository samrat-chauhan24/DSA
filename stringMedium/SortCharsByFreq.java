package stringMedium;
import java.util.*;

public class SortCharsByFreq {
    static String frequencySort(String s){// using hashing
        int freq[] = new int[128];
        // formation of count freq
        // for(int i = 0; i<s.length(); i++){
        //     freq[s.charAt(i)]++;
        // }
        // same working
        // formation of count freq
        for(char ch: s.toCharArray()){
            freq[ch]++;
        }
        // storing the og array in the list
        List<Character> charList = new ArrayList<>();
        for(int i = 0; i<128; i++){
            if(freq[i]>0){
                charList.add((char)i);
            }
        }
        
        // now sort the list using built in functions
        Collections.sort(charList, (a,b) -> freq[b] - freq[a]);
        // it is a built in function that, picks chars from list and then checks the which has more freq.
        // for making this asc jsut flip a and b
        
        // store sorted list in sb to return it
        StringBuilder sb = new StringBuilder();
        for(char ch: charList){
            for(int i =0; i<freq[ch]; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String sb = frequencySort("loveleetcode");
        System.out.println(sb);
    }
}
