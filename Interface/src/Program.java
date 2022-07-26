
public class Program {

	public static void main(String[] args) {
		Word word = new Word();
		//word.doPrinting(new LaserPrinter());
		//word.doPrinting(new InkJetPrinter());
		word.doPrinting(new DotMatrixPrinter());
	}

}
