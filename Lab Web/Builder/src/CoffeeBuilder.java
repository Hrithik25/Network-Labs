
public class CoffeeBuilder implements Builder {
	
	private Coffee coffee;
	
	public CoffeeBuilder(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void addWater(Water water) {
		System.out.println("adding water");
	}

	@Override
	public void addMilk(Milk milk) {
		System.out.println("adding milk");
	}

	@Override
	public void addSugar(Sugar sugar) {
		
		System.out.println("adding sugar");
	}

	@Override
	public void addCoffeePowder(CoffeePowder coffeePowder) {
		
		System.out.println("adding coffee powder");
	}

	@Override
	public void addTeaPowder(TeaPowder teaPowder) {
		
		// No Implementation
	}

	@Override
	public void addHorlicksPowder(HorlicksPowder horlicksPowder) {
		
		// No Implementation
	}

}
