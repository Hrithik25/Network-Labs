//import java.util.*;
class Reverse_Num {
	public static void main(String args[]) {
		int num = 12345;
		int rev = 0;
		int pow = 10000;
		int n = num;
		while(n > 0)
		{
			
			rev = rev + ((n%10) * pow);
			pow *= 10;
			n /= 10;
		}
		
		System.out.println("Original Number: "+num);
		System.out.println("Reversed Number: "+rev);
	}

}
