/**
 * 
 */
package com.sapient;

/**
 * @author cgarg1
 *
 */
class Process{
	public int[] create(){
		int[] num;
		num= new int[10];
		num[3]=6;
		num[5]=9;
		return num;
	}
public void display(int[] src){
for(int data:src){
	System.out.println(data);
}
}
}

    
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Begin");
		Process p = new Process();
		int[] result=p.create();
		p.display(result);
   
	}

}
