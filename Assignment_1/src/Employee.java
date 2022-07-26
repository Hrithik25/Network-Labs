
public class Employee extends Person {
	private int empid;
	private String company;
	
	public Employee(int empid, String name, String company) {
		super(name);
		this.empid = empid;
		this.company = company;
	}
}
