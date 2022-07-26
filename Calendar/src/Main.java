
public class Main {

	public static void main(String[] args) {
		Date d1 = new Date(1,8,2000);
		Date d2 = new Date(19,7,2022);
		
		System.out.println(d1.difference(d2));
		Date d3 = new Date();
		d3 = d1.nextDate(4);
		System.out.println(d3.getDay() +"/" +d3.getMonth() +"/" +d3.getYear());
	}

}
