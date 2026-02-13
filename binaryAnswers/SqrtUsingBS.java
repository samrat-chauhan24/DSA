package binaryAnswers;
public class SqrtUsingBS {
    static int sqrtnorm( int target){
        int sqrt = Integer.MIN_VALUE;
        if(target==1) return 1;
        for(int i = 0; i <= (target/2); i++){
            if(i*i<=target) sqrt = i;
        }
        return sqrt;
    }
    static int sqrtBS(int target){
        if (target==1||target==2||target==3) {
            return 1;
        }
        int nums[] = new int[(target/2)+1];
        int k = 0;
        for(int i = 0; i <= (target/2); i++){
            nums[k] = i;
            k++;
        }
        int l = 0, r = nums.length-1;
        while (l<=r) {
            int mid = l + (r-l)/2;
            if(nums[mid]*nums[mid]==target) return mid;
            else if(nums[mid]*nums[mid]>target) r = mid - 1;
            else l = mid + 1;
        }
        return r;
    }
    static int sqrtBinaryWithoutArray(int target){
        if (target==0) {
            return 0;
        }
        // if (target==1||target==2||target==3) {
        //     return 1;
        // }
        int l = 1, r = target;
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(mid==(target/mid)) return mid;
            else if (mid>(target/mid)) r = mid - 1;
            else l = mid + 1;
        }
        return r;
    }
    public static void main(String[] args) {
        int target = 3;
        int ans = sqrtnorm(target);
        System.out.println(ans);
        int ans2 = sqrtBS(target);
        System.out.println(ans2);
        int ans3 = sqrtBinaryWithoutArray(target);
        System.out.println(ans3);

    }
}
