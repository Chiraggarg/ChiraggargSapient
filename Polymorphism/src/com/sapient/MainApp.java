package com.sapient;

abstract class Employee{
	public abstract void netsalary();
	}
class Intern extends Employee{
	public void netsalary(){
		System.out.println("Intern Stipend");
	}
	
}
class Confirmed extends Employee{
	public void netsalary(){
		System.out.println(" Confirmed Employee Salary");
	}
		 public void transport(){
			 System.out.println("got transport");
		 }
	
}
class contract extends Employee{
	public void netsalary(){
		System.out.println(" Contract Employee Salary");
	}
	
}
class HR{
	public Employee recruit(String emptype){
		if(emptype.equals("I")){
		return new Intern();
		}else if(emptype.equals("C")){
		return new Confirmed();
		}else if(emptype.equals("t")){
			return new contract();
			}
		return null;
	}
}
class Finance{
	public void processSalary(Employee e){
		e.netsalary();
		if(e instanceof Confirmed){
			Confirmed conf=(Confirmed)e;
			conf.transport();
		}
	}
	
}
public class MainApp {
	public static void main(String[] args){
		HR hr= new HR();
		Finance finance= new Finance();
		Employee employee = hr .recruit("C");
		if(employee!=null){
			finance.processSalary(employee);
		}
		employee = hr .recruit("I");
		if(employee!=null){
			finance.processSalary(employee);
		}
		employee = hr .recruit("t");
		if(employee!=null){
			finance.processSalary(employee);
		}
	}

}
