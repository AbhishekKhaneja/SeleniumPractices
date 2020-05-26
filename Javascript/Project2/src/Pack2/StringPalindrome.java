package Pack2;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="nitin";
		String B ="";
		
		
		for(int i =(A.length()-1);i>=0;i--)
		{
			B = B+A.charAt(i);
		}
		System.out.println(B);
		
		if(A.equals(B))
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
		
//		char[] arr1 = { 'M', 'A', 'D', 'A', 'M' };
//		System.out.println(arr1);
//		char[] revchar = new char[arr1.length];
//		int j = 0;
//		for (int i = (arr1.length - 1); i >= 0; i--) {
//			revchar[j] = arr1[i];
//			j++;
//		}
//		j = 0;
//		int count = 0;
//		for (int i = 0; i < arr1.length; i++) {
//			if (revchar[j] == arr1[i]) {
//
//				count++;
//			}
//			j++;
//
//		}
//		if (count == arr1.length) {
//			System.out.println("It is a palindrome");
//		}
//		else
//		{
//			System.out.println("It is not a palindrome");
//		}
//
//		
//
	}


