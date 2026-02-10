public class SubarraySum {
    static int subarraySum(int nums[], int target){
        int numSubArrays = 0;
        for(int startIdx = 0; startIdx<nums.length; startIdx++){
            int sum = 0;
            for(int nextOFstart = startIdx; nextOFstart<nums.length; nextOFstart++){
                sum = sum + nums[nextOFstart];   
                if(sum == target) numSubArrays++;                       
            }
        }
    return numSubArrays;
    }
    public static void main(String[] args) {
        int nums[]  = {1,2,3};
        int result = subarraySum(nums,3);
        System.out.println("the required no of subarray is : "+ result);
    }
}
