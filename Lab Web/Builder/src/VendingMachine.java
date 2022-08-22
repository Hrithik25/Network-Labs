
public class VendingMachine {
	
	private Builder builder;
	private int beverageType;
	
	public VendingMachine(Builder builder) {
		this.builder = builder;
	}
	
	public void prepare(int beverageType) {
		if(beverageType == 1) {
			builder.addWater(null);
			builder.addMilk(null);
			builder.addSugar(null);
			builder.addCoffeePowder(null);
			
			
		}
		else if(beverageType == 2) {
			builder.addWater(null);
			builder.addMilk(null);
			builder.addSugar(null);
			builder.addTeaPowder(null);
		}
	}
}
