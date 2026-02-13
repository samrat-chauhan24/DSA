package binaryAnswers;

public class ThreshByBS {
    static int thresholdLimit(int nums[], int threshold){
        if(nums.length > threshold) return -1;
        int max = 0;
        for (int i : nums) {
            if(i > max) max = i;
        }
        int l = 1, r = max;
        while (l<=r) {
            int mid = l + (r-l)/2;
            int sum = ceilDivisor(nums, mid, threshold);
            if (sum <= threshold){
                r = mid - 1;
            }
            else if(sum > threshold) l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }
    static int ceilDivisor(int nums[], int mid, int threshold){
        int sum = 0;
        for (int i : nums) {
            sum += (i + mid - 1)/mid;
        }
        return sum;        
    }
    public static void main(String[] args) {
        int nums[] = {44,22,33,11,1};
        int ans = thresholdLimit(nums, 5);
        System.out.println(ans);
    }
}
