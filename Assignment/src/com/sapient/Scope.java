package com.sapient;

class Scope {
    public static void main(String[] args) {
    int xyz; // known to all code within main
    xyz = 10;
    if(xyz == 10) { // start new scope
    int yza = 20; // known only to this block
    System.out.println("x and y: " + xyz + " " + yza);
    xyz = yza * 2;
  }        
    System.out.println("x is " + xyz);
	}

}
