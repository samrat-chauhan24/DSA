package binaryAnswers;

public class KthMissingEle {
    static int findKthNum(int arr[], int k){
        int l = 0, r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            int missingNum = arr[mid] - (mid+1);
            if(missingNum < k) l = mid + 1;
            else r = mid - 1;
        }
        return l+k;
    }
    public static void main(String[] args) {
        int nums[]  = {2,3,4,7,11};
        int ans = findKthNum(nums, 5);
        System.out.println(ans);
    }
}
