package Tables;

import java.util.Scanner;

public class drive {
	
	String Message;
	public String driving(int age)
	{
		
		if(age<16)
		{
		Message="You can't drive";
		}
		if(age <=16 && age <=17)
		{
			Message="You can drive but not vote";	
		}
		if(age >=18 && age <=24)
		{
			Message="You can vote but not rent a car"	;	
		}
		if(age>=25)
		{
			Message="You can do pretty much anything";
		}
		return Message;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drive obj = new drive();
		System.out.println("Enter Your age");
		Scanner Scan= new Scanner(System.in);
		int age=Scan.nextInt();
		String M=obj.driving(age);
		System.out.println(M);
		
		
		
		

	}

}
