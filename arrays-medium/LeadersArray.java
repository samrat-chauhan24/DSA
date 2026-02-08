import java.util.*;

public class LeadersArray {
    static List<Integer> leaderarr(int nums[]){
        int  n = nums.length;
        int max = nums[n-1];
        List<Integer> leaders = new ArrayList<>();
        for(int i = n-1; i>=0;i--){
            if(i==n-1){
                leaders.add(nums[i]);
            }
            else if(nums[i] > max){
                max = nums[i];
                leaders.add(nums[i]);

            }
        }
        return leaders;
    }
    public static void main(String[] args) {
        int nums[] = {6,2,5,7,0};
        List<Integer> leaders = leaderarr(nums);
        System.out.println("leaders in the array are ");
        System.out.println(leaders);
       
        // reverse traversing
        System.out.println("the required output is : ");
        for(int i = leaders.size()-1; i>=0; i--){
            System.out.print(leaders.get(i)+" ");
        }
        System.out.println(" ");
       
        // reversing the list
        System.out.println("the final output is");
        Collections.reverse(leaders);
        System.out.println(leaders);

    }
}
