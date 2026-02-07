public class Multiple0 {
    static int[][] zeromatrice(int matrix[][]){
        boolean row_marks[] = new boolean[matrix.length];
        boolean columns_marks[] = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix [i][j] == 0){
                    row_marks[i] = true;
                    columns_marks[j] = true;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(row_marks[i]||columns_marks[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    return matrix;
    }
  
    public static void main(String[] args) {
        int matrix[][] = {{0,1,2,0},{3,4,5,2},{4,3,2,1}};
        matrix = zeromatrice(matrix);
        System.out.println("final matrix is : ");
        for(int i[] : matrix){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}


