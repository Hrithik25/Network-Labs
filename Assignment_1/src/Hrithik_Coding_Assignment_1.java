import java.util.*;
public class Hrithik_Coding_Assignment_1 {
	
	static void swap(int a, int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Numbers after swapping " +a +" " +b);
	}
	
	static void fibonacci(int num)
	{
		int first = 0;
		int second = 1;
		int third = 0;
		
		System.out.print(first +" " +second);
		for(int i=2; i<num; i++)
		{
			third = first + second;
			System.out.print(" " +third);
			first = second;
			second = third;
		}
		
		System.out.print("\n");
	}
	
	static int reverse(int num)
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
	
	static boolean is_palindrome(int num)
	{
		int rev = reverse(num);
		if(num == rev)
			return true;
		else
			return false;
	}


	public static void main(String[] args) {
		// 1. swap two numbers in Java
		System.out.println("1. swap two numbers in Java?");
		int a = 10;
		int b = 5;
		System.out.println("Numbers before swapping " +a +" " +b);
		swap(a,b);
		
		// 2. print all the elements  of Fibonacci Series for a given number
		System.out.println("2. print all the elements  of Fibonacci Series for a given number?");
		int num1 = 10;
		fibonacci(num1);
		
		//3. Check if a number is palindrome or not
		System.out.println("3. Check if a number is palindrome or not?")
		int num2 = 12121;
		System.out.println(is_palindrome(num2));
		
	}

}
