
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =153,r1,r2,q1,q2,r3,r4,r5,r6,Sum;
		r1=n%10;
		q1=n/10;
		r2=q1%10;
		q2=q1/10;
		r3=q2%10;
		
		r4=r1*r1*r1;
		r5=r2*r2*r2;
		r6=r3*r3*r3;
		
		Sum=r4+r5+r6;
		if(Sum==n)
		{
			System.out.println("Number is Arm");
		}
		else 
		{
			System.out.println("Number is not Arm");
		}
		

	}

}
