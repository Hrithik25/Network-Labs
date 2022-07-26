
public class Elevator {
	private int currentFloor;
	
	public Elevator() {
		
	}
	public Elevator(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	
	public String getNotation(int floor) {
		switch(floor) {
		case 1: return "st";
		case 2: return "nd";
		case 3: return "rd";
		default: return "th";
		}
	}
	
	public void goUp(int destinationFloor) {
		System.out.println("Door Closing");
		System.out.println("Going Up");
		int i;
		for(i=currentFloor+1; i < destinationFloor; i++) {
			System.out.println(i +getNotation(i) +" Floor");
		}
		System.out.println(i + getNotation(i) +" Floor You reached your destination");
	}
	
	public void goDown(int destinationFloor) {
		System.out.println("Door Closing");
		System.out.println("Going Down");
		int i;
		for(i=currentFloor-1; i > destinationFloor; i--) {
			System.out.println(i +getNotation(i) +" Floor");
		}
		if(i == 0) {
			System.out.println("Ground Floor You reached your destination");
			return;
		}
		System.out.println(i + getNotation(i) +" Floor You reached your destination");
	}
	
	
	public void enterDestination(int destinationFloor) {
		if(destinationFloor > 10) {
			System.out.println("Invalid Choice");
			System.out.println("You can go upto 10th Floor");
			return;
		}
		if(destinationFloor < 0) {
			System.out.println("Invalid Choice");
			System.out.println("You can go till Ground Floor");
			return;
		}
		
		if(this.currentFloor > destinationFloor) {
			goDown(destinationFloor);
		}
		else if(this.currentFloor < destinationFloor) {
			goUp(destinationFloor);
		}
		else {
			
			System.out.print("You are already on " +destinationFloor +getNotation(destinationFloor) +" floor");
		}
	}
}
