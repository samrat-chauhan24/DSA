public class RearranngeArray {
    static int [] rearrangeArray(int nums[]){
        int even_idx = 0, odd_idx = 1;
        int res[] = new int[nums.length];
        for(int i : nums){
            if(i>0){
                res[even_idx] = i;
                even_idx += 2;
            }
            else{
                res[odd_idx] = i;
                odd_idx += 2;
            }
        }
        nums = res.clone();
        return nums;
    }
    public static void main(String[] args) {
        int nums[ ] = {3,1,-2,-5,2,-4};
        int []renums = rearrangeArray(nums);
        for(int i : renums){System.out.print(i + " ");}
    }
}
