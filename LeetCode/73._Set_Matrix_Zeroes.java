class Solution {
    public void setZeroes(int[][] matrix) {
        int mat[][]=new int[matrix.length][];
        for(int i=0; i<matrix.length; i++){
            mat[i]= new int[matrix[i].length];
            System.arraycopy(matrix[i], 0, mat[i], 0, matrix[i].length);
        }

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    System.out.print(i+" ");
                    for(int i2=0; i2<matrix.length; i2++){
                        matrix[i2][j]=0;
                    }
                    for(int j2=0; j2<matrix[0].length; j2++){
                        matrix[i][j2]=0;
                    }
                }
            }
        }
    }




    // public void makeZero(int[][] matrix, int x, int y){
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             matrix[x][y]=0;
    //         }
    //     }
    // }

    // public void setZeroes(int[][] matrix) {
        
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             if(matrix[i][j]==0){
    //                 makeZero(matrix, i, 0);
    //                 makeZero(matrix, 0, j);
    //             }
    //         }
    //     }
    // }
}