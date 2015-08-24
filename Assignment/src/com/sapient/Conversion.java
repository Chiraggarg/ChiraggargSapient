package com.sapient;

class Conversion {
  public static void main(String[] args) {
    byte dataByte;
    int integerData = 257;
    final double doubleData = 323.142;
    
    System.out.println("\nConversion of int to byte.");
    dataByte = (byte) integerData;
    System.out.println("i and b " + integerData + " " + dataByte);

    System.out.println("\nConversion of double to int.");
    integerData = (int) doubleData;
    System.out.println("d and i " + doubleData + " " + integerData);

    System.out.println("\nConversion of double to byte.");
    dataByte = (byte) doubleData;
    System.out.println("d and b " + doubleData + " " + dataByte);
  }
}