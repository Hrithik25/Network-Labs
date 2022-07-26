
public class Marks {
	private int maths;
	private int eng;
	private int phy;
	private int chem;
	private int cs;
	
	public Marks(int a, int b, int c, int d, int e) {
		
	}
	
	public static String tellClass(int phy, int chem, int maths, int eng, int cs) {
		double percent = (phy+chem+maths+eng+cs)/5.0;
		if(percent >= 60) {
			return "First Class";
		}
		else if(percent >= 50) {
			return "Second Class";
		}
		else if(percent >= 33){
			return "Third Class";
		}
		return "Supplementry is six months away";
	}
	
	
}
