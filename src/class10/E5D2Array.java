package class10;

public class E5D2Array {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30,40, 50},
                {20, 50, 65, 20},
                {102, 54, 60},
                {20, 55},
        };
        for(int i=0; i<matrix.length; i++){
           int[] arr= matrix[i];
           for( int j=0; j< arr.length ; j++){
               System.out.print(matrix[i][j]+" ");
           }
            System.out.println();
        }
    }

}
