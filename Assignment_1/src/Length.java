
public class Length {
	private int ft = 0;
	private int inch = 0;
	
	Length(int ft, int inch)
	{
		this.ft = ft;
		this.inch = inch;
	}
	
	static double convertToCm(Length l1, Length l2)
	{
		Length sum = new Length(0,0);
		sum.ft = l1.ft + l2.ft;
		sum.inch = l1.inch + l2.inch;
		
		double cm = (sum.ft * 30.48) + (sum.inch * 2.54);
		
		return cm;
	}

}
