package com.sapient;

class Promote {
  public static void main(String[] args) {
    byte byteData = 42;
    char charData = 'a';
    short shortData = 1024;
    int intData = 50000;
    float floatData = 5.67f;
    double doubleData = .1234;
    double result = (floatData * byteData) + (intData / charData) - (doubleData * shortData);
    System.out.println((floatData * byteData) + " + " + (intData / charData)
        + " - " 
        + (doubleData * shortData));
    System.out.println("result = " + result);
  }
}