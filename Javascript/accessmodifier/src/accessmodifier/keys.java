package accessmodifier;

import java.util.Scanner;

public class keys {
	public static int j=0;
		public keys()
		{
		
		System.out.println("1.Add keychains to Order");
		System.out.println("2.Remove keycahins from order");
		System.out.println("3.view Current Order");
		System.out.println("4.checkout");
		

		}
				
		public static void  add()
		{
			System.out.println("You have "+j+" keychains.how many to add?");
	        Scanner scan1 = new Scanner(System.in);
	        int f=scan1.nextInt();
	        j=f+j;
	        System.out.println("you now have " + j +" Keychains");
		}
		public void remove()
		{
			System.out.println("You have "+ j +" keychains.how many to remove?");
	        Scanner scan = new Scanner(System.in);
	        int Q=scan.nextInt();
	        j=j-Q;
	        System.out.println("you now have" + j +"Keychains");
		}
		
	}
	


