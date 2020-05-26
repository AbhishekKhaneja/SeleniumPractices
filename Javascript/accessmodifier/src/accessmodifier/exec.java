package accessmodifier;

import java.util.Scanner;

public class exec {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=0;
		while(true)
		{
		keys obj=new keys();    
        System.out.println("Please enter your choice:");
		Scanner scan = new Scanner(System.in);
		int Q=scan.nextInt();
		switch(Q)
		{
		case 1 :keys.add();//because the method is static we can call it by using the classname 
		        break;
		        
		case 2 :obj.remove();
                 break;
		case 3:System.out.println("You have "+ keys.j +" keychains ");
                  break;
		case 4:System.out.println("checkout");
				System.exit(0);
				
	}

}
}
}
