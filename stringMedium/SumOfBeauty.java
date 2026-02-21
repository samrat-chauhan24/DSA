package stringMedium;

public class SumOfBeauty {
    static int beautySum(String s){
        int totBeautySum = 0;
        for(int i = 0; i<s.length(); i++){
            int countFreq[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                countFreq[s.charAt(j) - 'a']++;
                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for(int k = 0; k<26; k++){
                    if(countFreq[k]>0){
                        maxFreq = Math.max(maxFreq, countFreq[k]);
                        minFreq = Math.min(minFreq, countFreq[k]);
                    }
                } 
                totBeautySum += maxFreq - minFreq;              
            }
        }
        return totBeautySum;
    }
    public static void main(String[] args) {
        System.out.println(beautySum("aabcbaa"));
    }
}
