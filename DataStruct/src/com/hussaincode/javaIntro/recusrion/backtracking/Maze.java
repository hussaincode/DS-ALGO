package com.hussaincode.javaIntro.recusrion.backtracking;

import java.sql.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
       // System.out.println(count(3,3));
       // printPath("",3,3);
      //  System.out.println(retPath("",3,3));
      //  System.out.println(retPathDiagonal("",3,3));
        boolean[][] maze= {{true,true,true},{true,false,true},{true,true,true}};
        restrictPath("",maze, 0, 0);
    }
    static int count(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = count(row-1,col);
        int right = count(row, col-1);
        return right+left;
    }
    static void printPath(String p, int row, int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
             printPath(p+"D",row-1,col);
        }
        if(col>1){
              printPath(p+"R",row, col-1);
        }
    }

    static ArrayList<String> retPath(String p, int row, int col) {
        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1) {
            list.add(p);
            return list;
        }
        if (row > 1) {
            list.addAll(retPath(p + "D", row - 1, col));
        }
        if (col > 1) {
            list.addAll(retPath(p + "R", row, col - 1));
        }
        return list;
    }

    //with diagonal
    static ArrayList<String> retPathDiagonal(String p, int row, int col) {
        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1) {
            list.add(p);
            return list;
        }
        if (row > 1 && col > 1) {
            list.addAll(retPathDiagonal(p + "D", row - 1, col-1));
        }
        if (row > 1) {
            list.addAll(retPathDiagonal(p + "V", row - 1, col));
        }
        if (col > 1) {
            list.addAll(retPathDiagonal(p + "H", row, col - 1));
        }
        return list;
    }

    static void restrictPath(String p,boolean[][] maze, int row, int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row<maze.length-1){
            restrictPath(p+"D",maze, row+1,col);
        }
        if(col<maze[0].length-1){
            restrictPath(p+"R",maze, row, col+1);
        }
    }

}
