
public class Palindrome {
	static boolean is_palindrome(int num)
	{
		int rev = Reverse.reverse(num);
		if(num == rev)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		System.out.println(is_palindrome(num));
	}

}
