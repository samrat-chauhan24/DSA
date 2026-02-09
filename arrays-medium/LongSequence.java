public class LongSequence {
    static int longestConsecutive(int nums[]){
        int countOfLength = 1;
        int maxLength = 1;
        MergeSort(nums, 0, nums.length-1);
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]+1 == nums[i+1]){
                countOfLength++;
                maxLength = Math.max(maxLength, countOfLength);
            }
            else countOfLength = 1;
        }
    return maxLength;
    }
    static void MergeSort(int nums[], int l, int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        MergeSort(nums, l, mid);
        MergeSort(nums, mid+1, r);
        MergeFun(nums, l, mid, r);

    }
    static void MergeFun(int nums[], int l, int mid, int r){
        int temp[] = new int[r-l+1];
        int left = l;
        int right = mid+1;
        int k = 0;// index for temp array
        while(left<=mid && right<=r){
            if(nums[left]<nums[right]){
                temp[k] = nums[left];
                left++;
            }
            else{
                temp[k] = nums[right];
                right++;
            }
        k++;
        }
        while(left<=mid){
            temp[k] = nums[left];
            left++; k++;
        }
        while(right<=r){
            temp[k] = nums[right];
            right++; k++;
        }
        //
        
        for(int i =0; i<temp.length; i++){
            nums[l+i] = temp[i];
            
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        int maxLength = longestConsecutive(nums);
        System.out.println("max length is : "+maxLength);
    }
}
