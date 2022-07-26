
public class Stack {
	private char arr[];
	private int top;
	private int size;
	
	public Stack(int size){
		this.size = size;
		arr = new char[size];
		top = -1;
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public void push(char x)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top] = x;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return;
		}
		top--;
	}
	
	public char top() {
		if (!isEmpty()) {
            return arr[top];
        }
        return 'x';
	}
}
