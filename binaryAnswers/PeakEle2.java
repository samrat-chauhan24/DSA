package binaryAnswers;

public class PeakEle2 {
    static int[] peakMatrix(int matrix[][]){
        int index[] = new int[2];
        int l = 0;
        int r = matrix[0].length-1;
        while (l<=r) {
            int mid = l+(r-l)/2;
            int row = maxFun(matrix,mid);
            
            int left = (mid-1 >= 0) ? matrix[row][mid-1]:Integer.MIN_VALUE; 
            int right = (mid+1 < matrix[0].length) ? matrix[row][mid+1]:Integer.MIN_VALUE;
            
            if(matrix[row][mid]>left && matrix[row][mid]>right){
                index[0] = row;
                index[1] = mid;
                return index;
            }
            else if (left > matrix[row][mid] ) r = mid - 1;
            else l = mid + 1;
        }
        return index;
    }
    static int maxFun(int matrix[][], int mid){
        int row = 0;
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][mid] > matrix[row][mid]) row = i;
        }
        return row;
    }
    public static void main(String[] args) {
        int matrix[][] = {{5,10,8},{4,1,7},{3,9,6}};
        int ans[] = peakMatrix(matrix);
        System.out.println(ans[0]+","+ans[1]);
    }
}
