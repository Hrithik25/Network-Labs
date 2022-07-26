
public class Height {
	private int ft;
	private int inch;
	
	public Height() {
	}
	
	public Height(int ft, int inch) {
		this.ft = ft;
		this.inch = inch;
	}
	
	public int getFt() {
		return ft;
	}
	public void setFt(int ft) {
		this.ft = ft;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public void setHeight(int ft, int inch) {
		this.ft = ft;
		this.inch = inch;
	}
	
	public Height add(Height h1) {
		Height h2 = new Height();
		h2.ft = this.ft + h1.ft;
		h2.inch = this.inch + h1.inch;
		if(h2.inch >= 12) {
			h2.ft++;
			h2.inch -= 12;
		}
		return h2;
	}
	
	public double getCm() {
		
	}
}
