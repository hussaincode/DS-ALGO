package com.hussaincode.javaIntro.arrays05;

public class Q20 {
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] target={{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (checkEquality(mat, target)) {
                return true;
            }
            rotateMatrix(mat);
        }
        return false;
    }

    static void rotateMatrix(int [][] mat){
        /*
        To Rotate the MATRIX
          --> Firstly transpose it
          --> then Flip the Elements of ROWS
         */
        for(int row=0; row< mat.length ; row++){
            for(int column=0;column<row ; column++){
                // Interchange ROWS and COLUMNS
                int temp = mat[row][column];
                mat[row][column] = mat[column][row];
                mat[column][row] = temp;
            }
        }

        // At This Point we have Transpose MATRIX
        // NOW FLIP the ELEMENTS of ROWS
        int start = 0;
        int end = mat.length-1;
        while(start <= end) {
            for(int i= 0 ; i< mat.length;i++){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
    }

    static boolean checkEquality(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
}
