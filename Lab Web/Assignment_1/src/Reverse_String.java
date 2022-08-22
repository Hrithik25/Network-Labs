import java.util.*;
public class Reverse_String {

	static String reverse_string(String str)
	{
		int end = str.length() - 1;
		int start = 0;
		
		while(start < end)
		{
			Collections.swap(str, end, start);
			start++;
			end--;
		}
		return str;
	}
	public static void main(String[] args) {
		
		String str = "abcdefg";
		System.out.println(reverse_string(str));
	}

}
