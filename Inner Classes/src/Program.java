
public class Program {

	public static void main(String[] args) {
		InnerInterface inner = 
				new InnerAdaptor() {
			public void sayA() {
				System.out.println("anonymous inner class");
			}
		};
		inner.sayA();
		
		OuterClass outer = new OuterClass();
		OuterClass.Inner inner2 = new Inner();
		inner2.sayHi();

	}

}
