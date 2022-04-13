package proxy;

public class Main {

	public static void main(String[] args) {
		MijlocTransport autobuz=new Autobuz(10,"Mercedes");
		MijlocTransport autobuzDeNoapte=new AutobuzDeNoapte(autobuz);
		autobuz.opresteInStatie();
		autobuzDeNoapte.opresteInStatie();
		autobuzDeNoapte.setNrCalatori(0);
		autobuzDeNoapte.opresteInStatie();
	}

}
