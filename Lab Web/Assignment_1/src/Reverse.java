
public class Reverse {
	public static int reverse(int num)
	{
		int rev = 0;
		int d;
		
		while(num != 0)
		{
			d = num % 10;
			rev = rev * 10 + d;
			num /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		System.out.println(reverse(num));
	}

}
