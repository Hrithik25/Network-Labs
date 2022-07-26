
public class WindowsFactory implements Factory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public List createList() {
		return new WindowsList();
	}

}
