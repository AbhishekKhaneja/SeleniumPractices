
public class Circularprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int l, m, n;
		for (int i = 10; i < 100; i++)
		{
			for (int j = 2; j < i; j++)
			{
				if ((i % j == 0)) 
				{

					count++;
				}
			}
			if (count == 0) 
			{
				System.out.println(i);

				int k;
				k = i % 10;
				l = i / 10;
				n = (k * 10 + l);
				System.out.println("value of n=" + n);
				int flag = 0;
				for (int h = 2; h < n; h++) {
					if (n % h == 0) {
						flag++;

					}
					if (flag == 0) {
						System.out.println(n);
					}

				}

			}
		}
		count = 0;
	}
}
