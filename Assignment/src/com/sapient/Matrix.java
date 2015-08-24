package com.sapient;

class Matrix {
  public static void main(String[] args) {
    double[][] matrix = {
      { 0 * 0, 1 * 0, 2 * 0, 3 * 0 },
      { 0 * 1, 1 * 1, 2 * 1, 3 * 1 },
      { 0 * 2, 1 * 2, 2 * 2, 3 * 2 },
      { 0 * 3, 1 * 3, 2 * 3, 3 * 3 }
    };
    int row;
    int column;

    for(row = 0; row < 4; row++) {
      for(column = 0; column < 4; column++)
        System.out.print(matrix[row][column] + " ");
      System.out.println();
    }
  }
}