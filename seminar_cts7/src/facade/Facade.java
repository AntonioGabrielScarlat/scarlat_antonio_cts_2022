package facade;

public class Facade {
	private Autobuz autobuz;

	public Facade(Autobuz autobuz) {
		super();
		this.autobuz = autobuz;
	}
	public void deschideUsi(Autobuz autobuz) {
		autobuz.deschideUsaFata();
		autobuz.deschideUsaMijloc();
		autobuz.deschideUsaSpate();
	}
	public void inchideUsi(Autobuz autobuz) {
		autobuz.inchideUsaFata();
		autobuz.inchideUsaMijloc();
		autobuz.inchideUsaSpate();
	}
}
