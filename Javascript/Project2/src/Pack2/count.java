package Pack2;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Ass="I am java Program etc I love java Langaugae java is easy language";
String Y="java";
int a=Ass.length();
int count=0;
//System.out.println(Ass.length());
String[] b=Ass.split(" ");
//System.out.println(b[0]);
//System.out.println(b[1]);
//System.out.println(b[2]);
//System.out.println(b[3]);
//System.out.println(b[4]);
//System.out.println(b[5]);
//System.out.println(b[6]);



for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);

	if(b[i].equals("java"))
			{
		count++;
			}
}
System.out.println(count);
	}

}
