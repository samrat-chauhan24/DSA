import java.util.*;
public class SpiralOrder {
    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,0,1},{3,4,5,2},{5,3,2,1}};
        for(int i[] : matrix){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println("debug");
        List<Integer> result = new ArrayList<>();
        int topWall = 0, rightWall = n-1, bottomWall = m-1, leftWall = 0;
        while(topWall <=bottomWall && leftWall <= rightWall){
            
            //top
            for(int i = leftWall; i<=rightWall;i++){
                result.add(matrix[topWall][i]);
            }
            topWall++;
           
            //right
            for(int i = topWall; i<=bottomWall; i++){
                result.add(matrix[i][rightWall]);
            }
            rightWall--;
           
            //bottom
            if(topWall<=bottomWall){
                for(int i = rightWall; i>=leftWall;i--){
                result.add(matrix[bottomWall][i]);
            }
            bottomWall--;}
            
            //left
            if(leftWall<=rightWall){
                for(int i = bottomWall; i>=topWall; i--) {
                result.add(matrix[i][leftWall]);
            }
            leftWall++; }          
        }
        System.out.println(result);
    }
    
}
