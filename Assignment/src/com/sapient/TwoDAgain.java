package com.sapient;

class TwoDAgain {
  public static void main(String[] args) {
    int[][] twoD = new int[4][];
    twoD[0] = new int[1];
    twoD[1] = new int[2];
    twoD[2] = new int[3];
    twoD[3] = new int[4];

    int row;
    int column;
    int value = 0;

    for(row = 0; row < 4; row++){
      for(column = 0; column < row+1; column++) {
        twoD[row][column] = value;
        value++;
      }
    }

    for(row = 0; row < 4; row++) {
      for(column = 0; column < row+1; column++)
        System.out.print(twoD[row][column] + " ");
      System.out.println();
    }
  }
}