package binaryAnswers;

public class KokoEatingBanana {
    static long ceilDivisor(int piles[], int mid){
        long sum = 0;
        for (int i : piles){
        sum += (i + (long) mid - 1)/mid;
        } 
        return sum;     
    }
    static int Koko(int piles[], int h){
        int max = 0;
        for (int i : piles) {
            if(i>max) max = i;
        }
        int l = 1, r = max;
        while(l<=r){
            int mid = l+(r-l)/2;
            long sum = ceilDivisor(piles, mid);
            if(sum<=h) r = mid - 1;
            else if (sum > h) l = mid + 1;
            else r = mid -1; 
        }
        return l;
        
    }
    public static void main(String[] args) {
        int nums[]  = {25, 12, 8, 14, 19};
        int totalhours = 5;
        int ans = Koko(nums, totalhours);
        System.out.println(ans);
    }

}
