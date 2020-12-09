package com.company.Lec32;

public class MazePath {

    public static void main(String[] args) {

        int row= 6;
        int col=6;
        int[][] mem = new int[row+1][col+1];
        System.out.println(count(6,6));
        System.out.println(mazePath(row,col,mem));

    }

    public static int count(int row, int col){

        if(row==1 || col==1){
            return 1;
        }

        return count(row-1,col)+ count(row,col-1);
    }

    public static int countRecDp(int row, int col, int[][] mem){

        if(row==1 || col==1){
            return 1;
        }

        if(mem[row][col]!=0){
            return mem[row][col];
        }

        mem[row][col]=  countRecDp(row-1 ,col, mem)+ countRecDp(row, col-1, mem);

        return mem[row][col];
    }


    public static int mazePath(int row, int col, int[][] mem){


        for (int i = 1; i <=row ; i++) {

            for (int j = 1; j <=col ; j++) {

                if(i==1 || j==1){
                    mem[i][j]=1;
                }

                else{

                    mem[i][j]= mem[i-1][j] +mem[i][j-1];
                }
            }
        }

        return mem[row][col];
    }

}
