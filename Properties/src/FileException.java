
public class FileException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public FileException(String msg) {
		this.msg = msg;
		showError();
	}
	public void showError() {
		System.out.println(msg);
	}
}
