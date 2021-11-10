package com.hussaincode.javaIntro.arrays05;
//https://leetcode.com/problems/flipping-an-image/submissions/
public class Q13 {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flipAndInvertImage(image));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int l=image[i].length;
            for(int j=0; j<l/2;j++) {
                int temp=image[i][j];
                image[i][j] = image[i][l-j-1];
                image[i][l-j-1]=temp;

            }

        }

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if (image[i][j] == 1)
                    image[i][j]=0;
                else
                    image[i][j]=1;
            }
        }
        return image;
    }
}
