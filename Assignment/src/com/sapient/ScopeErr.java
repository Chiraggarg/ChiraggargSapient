package com.sapient;

class ScopeErr {
  public static void main(String[] args) {
    int bar = 1;
    {              // creates a new scope
      bar = 2; // Compile time error -- bar already defined!
    }
  }
}