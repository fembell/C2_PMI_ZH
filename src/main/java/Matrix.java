
import java.util.Arrays;
import java.util.ArrayList;

public class Matrix {
    static int numberOfNonZeroValues(int[][] matrix){
        int nonzero = 0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                if(matrix[i][j]!=0){
                    nonzero++;
                }
            }
        }
        return nonzero;
    }
   static ArrayList<Integer> indexOfColumnsWithSameValues(int[][] matrix){
        boolean[] ugyanazok = new boolean[matrix.length];
        Arrays.fill(ugyanazok, true);
        for(int i = 0;i<matrix.length;i++){
            int szam = matrix[i][0];
            for(int j = 0; j<matrix[i].length;j++){
                if(matrix[i][j]!=szam){
                    ugyanazok[i] = false;
                }
            }
        }
       ArrayList<Integer> indexek = new ArrayList<>();
       for(int i = 0; i < ugyanazok.length; i++) {
           if(ugyanazok[i]) {
               indexek.add(i);
           }
       }
       return indexek;
    }
}
