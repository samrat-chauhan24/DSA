public class Optimal_numonce{
    static int singlenum(int nums[]){
        int xor = 0;
        for(int i : nums){
            xor = xor^i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[] = {4,4,2,2,1,3,3};
        int res = singlenum(nums);
        System.out.println("this num only appears once : "+ res);
     }
}