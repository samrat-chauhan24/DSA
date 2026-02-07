public class Twosumproblem {
    static int [] twosumproblem(int arr[], int target){
    int sol[] = new int[2];
    for(int i = 0; i<arr.length; i++){
        for(int j = i+1; j<arr.length; j++){
            if(arr[i]+arr[j] == target){
                sol[0] = i;
                sol[1] = j;
                return sol;
            }
        }
    }
    return sol;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int[] sol = twosumproblem(arr, 18);
        System.out.print("required indices are : ");
        System.out.print(sol[0]);
        System.out.print(" and ");
        System.out.print(sol[1]);
    }
}
