package com.sapient;

class Average {
  public static void main(String[] args) {
    double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
    double result = 0;
    int loopVariable;
    
    for(loopVariable = 0; loopVariable < 5; loopVariable++)
      result = result + nums[loopVariable];

    System.out.println("Average is " + result / 5);
  }
}