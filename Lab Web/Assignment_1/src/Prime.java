import java.util.*;
public class Prime {

	public static boolean is_prime(int num)
	{
		int i=2;
		for(i=2; i<= Math.sqrt(num); i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int counter = 0;
		int num = 1;
		while(counter <= 100)
		{
			if(is_prime(num))
			{
				System.out.println(num);
				counter++;
			}
			num++;
			
		}
		
	}

}
