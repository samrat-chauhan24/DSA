public class Rearrangearray {
    static int [] []rearray(int arr[]){
        int pc = 0, nc = 0;
        for(int i :arr){
            if(i>0) pc++;
            else nc++;
        }
        int pos [] = new int[pc];
        int neg [] = new int[nc];
        int t = 0;       
        for(int i : arr){
            
            if(i>0) {pos[t] = i;t++;}
        }
        int t1 = 0;
         for(int i : arr){
            
            if(i<0) {neg[t1] = i;t1++;}
            
        }
        return new int[][] { pos, neg };
}
static int [] rearrange(int arr[], int pos[], int neg[]){
    int k = 0, l=0,m =0;
    for(int i = 0; i<arr.length; i++){
        if(i%2==0){
            arr[k] = pos[l];
            k++;l++;
        }
        else{
            arr[k] = neg[m];
            k++;m++;
        }
    }
    return arr;
}
public static void main(String[] args) {
    int arr []= {3,1,-2,-5,2,-4};
    int  res[] [] = rearray(arr);
    int pos[] = res[0];
    int neg[] = res[1];
    for(int i : pos){
        System.out.print(i+" ");
    }
    System.out.println(" ");
    for(int i : neg){
        System.out.print(i+ " ");
    }
    arr=rearrange(arr, pos, neg);
    System.out.println("final rearranges array is : ");
    for(int i : arr){
        System.out.print(i+ " ");
    }

}
}
