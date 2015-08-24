package com.sapient;

class LifeTime {
  public static void main(String[] args) {
    int counter; 

    for(counter = 0; counter < 3; counter++){
      int variable = -1; // y is initialized each time block is entered
      System.out.println("y iz: " + variable); // this always prints -1
      variable = 100; 
      System.out.println("y is now: " + variable);
    }
  }
}