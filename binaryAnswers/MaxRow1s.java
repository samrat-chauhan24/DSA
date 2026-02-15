package binaryAnswers;

public class MaxRow1s {
    static int maxRowOnes(int matrix[][]){
        int idx = -1;
        int cnt_max = 0;
        for(int i = 0; i< matrix.length; i++){
            int curr_count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==1){
                    curr_count++;
                }
                if(curr_count>cnt_max){
                    cnt_max = curr_count;
                    idx = i;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{0,0,1},{0,0,0}};
        int ans = maxRowOnes(matrix);
        System.out.println(ans);
    }

}
