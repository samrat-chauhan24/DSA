public class Setzeroes {
    static void zeromatrice(int matrix[][]){
        boolean firstRow = false, firstColumn = false;
        
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j]==0) firstRow = true;
        }
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0]==0) firstColumn = true;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if( matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;                   
                }
            }
        }
        //fixing first row and col
        if(firstRow){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        if(firstColumn){
            for(int i =0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
   
    }
  
    // public static void main(String[] args) {
    //     int matrix[][] = {{0,1,2,0},{3,4,5,2},{4,3,2,1}};
    //     matrix = zeromatrice(matrix);
    //     System.out.println("final matrix is : ");
    //     for(int i[] : matrix){
    //         for(int j : i){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
        
    // }
}
    
