package facade;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz();
		Facade facade=new Facade(autobuz);
		facade.deschideUsi(autobuz);
		facade.inchideUsi(autobuz);
	}

}
