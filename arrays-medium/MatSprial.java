public class MatSprial {
    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,0,1},{3,4,5,2},{5,3,2,1}};
        for(int i[] : matrix){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int n = matrix[0].length;
        System.out.println("debug");
        for(int i = 0; i<matrix.length;i++){
            if(i==0){
                for(int j = 0; j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+ " ");
                }
            }
            if(i==1){
                System.out.print(matrix[i][n-1]+ " ");
                
            }
            if(i==2){
                for(int j = n-1;j>=0;j--){
                    System.out.print(matrix[i][j]+ " ");
                }
            }
            
        }
        for(int i = 0; i<matrix.length;i++){
           if(i==1){
            for(int j = 0; j<matrix[0].length-1;j++){
                    System.out.print(matrix[i][j]+ " ");
                }
            } 
        }
    }
}
