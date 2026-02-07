import java.util.Scanner;
public class hashing {
    public static int[] hash(int num[], int arr[]){
        for(int i = 0; i<num.length; i++){
            arr[num[i]]++;
        }
        return arr;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of array : ");
            int n = sc.nextInt();
            
            int num[] = new int[n];
            System.out.println("enter the elements for array : ");
            for(int i = 0; i<n; i++){
                num[i] = sc.nextInt();
            }
            
            int max = num[0];
            for(int i = 0; i<n; i++){
                if(num[i]>max){
                    max = num[i];
                }
            }
            
            int arr []= new int [max+1];
            arr = hash(num, arr);
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
}