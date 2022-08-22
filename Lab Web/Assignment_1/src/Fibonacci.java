import java.util.*;
public class Fibonacci {

	static void fibonacci(int num)
	{
		int first = 0;
		int second = 1;
		for(int i=0; i<num; i++)
		{
			System.out.printf("%d %d ", first, second);
			//int temp = first;
			first = second;
			second = second + first;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		fibonacci(num);
	}

}
