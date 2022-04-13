package decorator;

public class Main {

	public static void main(String[] args) {
		Printer printer=new PrinterBilet();
		Decorator decorator=new DecoratorOcazional(printer, "Paste fericit!");
		printer.printeazaBilet();
		decorator.printeazaMesaj();

	}

}
