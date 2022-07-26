import java.util.*;

/*public class Length {  // Focus on class name, should be Height
	int ft = 0;  // specify access specifiers
	int inch = 0;
	
	Length(int ft, int inch)
	{
		this.ft = ft;
		this.inch = inch;
	}
}*/

public class Unit_Converter {
		
	public static void main(String[] args) {
		Height l1 = new Height(5,6);
		Height l2 = new Height(4,7);
		
		/*Length sum = new Length(0,0);
		sum.ft = l1.ft + l2.ft;
		sum.inch = l1.inch + l2.inch;
		
		double cm = (sum.ft * 30.48) + (sum.inch * 2.54); // implement the conversion function inside Length class
		*/
		
		System.out.println("Sum in cm is " +Height.convertToCm(l1,l2));
	}

}
