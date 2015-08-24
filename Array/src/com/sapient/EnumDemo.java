package com.sapient;
enum Apple{
	Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);
	
	private int price;
	
	Apple(int p){
		price=p;
	}
	int getPrice(){
		return price;
	}
}

public class EnumDemo {
	
	public static void main(String args[])
	{
		Apple ap;
		System.out.println("Winesap costs "+ Apple.Winesap.getPrice()+" cents");
		
		System.out.println("All apple price");
		for(Apple a:Apple.values())
			System.out.println(a+" costs "+a.getPrice()+" cents.");
	}

}
