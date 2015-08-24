package com.sapient;

class BoolTest {
  public static void main(String[] args) {
    boolean ball;
    ball = false;
    System.out.println("b is " + ball);
    ball = true;
    System.out.println("b is " + ball);
	if(ball){ 
      System.out.println("This is executed.");// a boolean value can control the if statement
  }
    ball = false;
    if(ball){ 
      System.out.println("This is not executed.");
    }
    System.out.println("10 > 9 is " + (10 > 9));
  }

}
