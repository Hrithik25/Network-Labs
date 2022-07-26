
public class Salary {
	private int basic;
	private double da;
	private double hra;
	private int netSal;
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double resDa) {
		this.da = resDa;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double resHra) {
		this.hra = resHra;
	}
	public int getNetSal() {
		return netSal;
	}
	public void setNetSal(int netSal) {
		this.netSal = netSal;
	}
}
class DaThread extends Thread{
	private Salary salary;
	public DaThread(Salary salary) {
		this.salary = salary;
	}
	public void run() {
		double resDa = 0;
		resDa = .5 * salary.getBasic();
		salary.setDa(resDa);
	}
}

class HraThread extends Thread{
	private Salary salary;
	public HraThread(Salary salary) {
		this.salary = salary;
	}
	public void run() {
		double resHra = 0;
		resHra = .10 * salary.getBasic();
		salary.setHra(resHra);
	}
}
