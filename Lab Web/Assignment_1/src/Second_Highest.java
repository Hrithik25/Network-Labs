
public class Second_Highest {
	static int second_highest(int[] arr)
	{
		int highest = arr[0];
		int sec_highest = 0;
		for(int i=1; i<10; i++)
		{
			if(arr[i] > highest)
			{
				sec_highest = highest;
				highest = arr[i];
			}
		}
		return sec_highest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,5,1,3,6,18,35,11,9,80};
		System.out.println(second_highest(arr));

	}

}
