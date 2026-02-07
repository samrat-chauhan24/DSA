public class RotateMat90 {
    static int [][] rotate90(int matrix[][]){
        for(int i = 0; i<matrix.length; i++){
            for(int j = i+1; j<matrix[0].length; j++){//j = i+1 to avoid diagonal swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // for(int i = 0; i<matrix.length; i++){
            // for(int j = 0; j<matrix[0].length; j++){
            //     matrix[0][j] = matrix[j][0];
            // }
        // }
    return matrix;    
    }
    static int [][] revrow(int matrix[][]){
        int n = matrix.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        matrix = rotate90(matrix);
        System.out.println("final matrix is : ");
        for(int i[] : matrix){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int matrix1[][] = revrow(matrix);
        System.out.println("final matrix is : ");
        for(int i[] : matrix1){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
