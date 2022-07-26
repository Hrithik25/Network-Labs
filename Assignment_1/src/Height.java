
public class Height {
	private int ft = 0;
	private int inch = 0;
	
	Height(int ft, int inch)
	{
		this.ft = ft;
		this.inch = inch;
	}
	
	static double convertToCm(Height l1, Height l2)
	{
		Height sum = new Height(0,0);
		sum.ft = l1.ft + l2.ft;
		sum.inch = l1.inch + l2.inch;
		
		double cm = (sum.ft * 30.48) + (sum.inch * 2.54);
		
		return cm;
	}

}
