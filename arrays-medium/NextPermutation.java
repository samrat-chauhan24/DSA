public class NextPermutation {
    static void nextPermutation(int nums[]){
        int n = nums.length;
        int idxOfBreakPoint = -1; // breakpoint whenever there is a dip from the left side
        
// for finding breakpoint
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idxOfBreakPoint = i;
                break;
            }
        }
// if alredy the last permutation
        if (idxOfBreakPoint == -1) {
            reverse(nums, 0, n-1);
            return; 
        }
// swapping it with the smallest number that is grater then breakpoint
        for(int i = n-1; i>=idxOfBreakPoint; i--){
            if(nums[i] > nums[idxOfBreakPoint]){
                int t = nums[i];
                nums[i] = nums[idxOfBreakPoint];
                nums[idxOfBreakPoint] = t;
                break;
            }
        }
// reversion of array after swapping breakpoint
        reverse(nums, idxOfBreakPoint+1, n-1);
       
    }
    static void reverse(int nums[], int l, int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++; r--;
        }
    }
}
