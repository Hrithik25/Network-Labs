
public class Student extends Person{
	private int rollNo;
	
	public Student() {
		
	}
	
	// sub class constructor is calling super class constructor
	public Student(int rollNo, String name) {
		super(name);
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Roll No " +this.getRollNo());
		System.out.println("Name " +this.getName());
	}
}
