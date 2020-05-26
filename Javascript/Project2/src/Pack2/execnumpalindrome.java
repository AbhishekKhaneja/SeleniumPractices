package Pack2;

public class execnumpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num= {1,2,1};
numberpalindrome obj = new numberpalindrome();
int collect=obj.palindrome(num);
System.out.println(collect);
if(collect>0)
{
	System.out.println("number is palindrome");
}
else
{
	System.out.println("number is not palindrome");
}

	}

}
