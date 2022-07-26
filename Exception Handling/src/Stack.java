
public class Stack {
	private int arr[];
	private int top;
	private int size;
	
	public Stack(int size){
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	
	public void push(int x)
	{
		arr[++top] = x;
	}
	
	public int pop() {
		return arr[top--];
	}
	
}
