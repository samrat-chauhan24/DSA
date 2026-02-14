package binaryAnswers;

import java.util.Arrays;

public class Mbouquets {
    static int makeBouquets(int bloomday[], int m, int k){
        if ((long)m * k > bloomday.length) return -1;
        int l= Arrays.stream(bloomday).min().getAsInt();
        int r= Arrays.stream(bloomday).max().getAsInt();
        int ans = r;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(possibleDays(bloomday, mid, k, m)){
                ans = mid;
                r = mid -1;
            }
            else l = mid + 1;
        }
        return ans;
        
    }
    static boolean possibleDays(int bloomday[], int mid, int k, int m){
        int count = 0, NoBoq = 0;
        for (int j = 0; j < bloomday.length; j++) {
            if (bloomday[j] <= mid) {
                count++;
                if (count==k) {
                NoBoq++;
                count = 0;
            }
            }
            else count = 0;            
        }
        return NoBoq>=m;
    }
    public static void main(String[] args) {
        int nums[] = {7,6,7,7,7,12,11,7};
        int ans = makeBouquets(nums, 2, 3);
        System.out.println(ans);
    }
}
