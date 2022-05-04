package state;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz(105);
		autobuz.pleacaInCursa();
		autobuz.ajungeLaCapatDeLinie();
		autobuz.pleacaInCursa();
		autobuz.ajungeLaCapatDeLinie();
		autobuz.trimiteInService();
		autobuz.scoateDinService();
		autobuz.pleacaInCursa();

	}

}
