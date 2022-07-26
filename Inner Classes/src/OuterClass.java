
public class OuterClass {
	private int data = 40;
	
	class Inner{
		void sayHi() {
			System.out.println("Data " +data);
		}
	}
}
