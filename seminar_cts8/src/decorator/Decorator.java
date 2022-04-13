package decorator;

public abstract class Decorator extends Printer{
	protected Printer printer;
	
	
	public Decorator(Printer printer) {
		super();
		this.printer = printer;
	}

	public void printeazaBilet() {
		printer.printeazaBilet();
	}
	
	public abstract void printeazaMesaj();
}
