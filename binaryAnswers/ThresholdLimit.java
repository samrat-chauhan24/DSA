package binaryAnswers;

public class ThresholdLimit {
    static int checkLimit(int nums[], int threshold){
        int max = 0;
        for (int i : nums) {
            if(i>max) max = i;
        }
        for(int i = 1; i <= max; i++){
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += (nums[j]+i - 1)/i;
            }
            if(sum <= threshold) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int ans = checkLimit(nums, 5);
        System.out.println(ans); 
    }
}
