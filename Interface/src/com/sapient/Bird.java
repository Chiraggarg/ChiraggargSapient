package com.sapient;

public class Bird extends Animal implements Flyer  {

	@Override
	public void takeoff() {
		System.out.println(" It has legs ");
		
	}

	@Override
	public void land() {
		System.out.println(" It has legs ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("  has  ");
		// TODO Auto-generated method stub
		
	}
	
	public void buildnest() {
		System.out.println("  has  ");
		// TODO Auto-generated method stub
		
	}
	public void layeggs() {
		System.out.println("  has  ");
		// TODO Auto-generated method stub
		
	}
}
