
public class Program {

	public static void main(String[] args) {
		
		Factory factory = new WindowsFactory();
		Button button = factory.createButton();
		button.draw();
		List list = factory.createList();
		list.draw();
		
		Factory macFactory = new MacFactory();
		Button macButton = macFactory.createButton();
		macButton.draw();
		List macList = macFactory.createList();
		macList.draw();
	}

}
