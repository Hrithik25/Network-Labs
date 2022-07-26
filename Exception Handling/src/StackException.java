
public class StackException extends Exception {
	private String msg;
	
	public StackException(String msg) {
		this.msg = msg;
	}
	public void showError(String msg) {
		System.out.println(msg);
	}
}
