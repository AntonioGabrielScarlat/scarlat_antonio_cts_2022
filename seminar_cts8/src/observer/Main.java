package observer;

public class Main {

	public static void main(String[] args) {
		Subject a1=new Autobuz(1);
		Observer c1=new Calator("Andrei");
		Observer c2=new Calator("Marian");
		Observer c3=new Calator("Ana");

		a1.aboneaza(c1);
		a1.aboneaza(c2);
		a1.aboneaza(c3);
		
		a1.pleacaDeLaCapat();
	}

}
