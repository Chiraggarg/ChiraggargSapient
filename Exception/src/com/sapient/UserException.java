package com.sapient;

class IllegalAgeException extends Throwable{
	void getmessage()
	{
		System.out.println("Illegal Age");
	}
}
class Vote{
	public void register(int age) throws IllegalAgeException{
		if(age<18)
			throw new IllegalAgeException();
		System.out.println("You are eligible to register for vote");
	}
}
public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vote vote = new Vote();
try {
	vote.register(16);
} catch (IllegalAgeException e) {
	// TODO Auto-generated catch block
	e.getmessage();
}

	}

}
