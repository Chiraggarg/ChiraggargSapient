package com.sapient;

public class Superman extends Animal implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("It can fly");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		System.out.println("It can fly");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("It can fly");
		// TODO Auto-generated method stub
		
	}
	
	public void leapBuilding(){
		System.out.println("It can fly");
	}
	
	public void eat(){
		System.out.println("It can eat");
	}
	

}
