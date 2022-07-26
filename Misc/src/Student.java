
public class Student implements Cloneable{
	private int rollNo;
	private String name;
	
	public void initialize(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

public class TestClone() {
	
}