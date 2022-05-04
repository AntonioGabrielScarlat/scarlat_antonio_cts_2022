package state;

public class StareLaCapatDeLinie implements Stare{

	@Override
	public void modificaStare(Autobuz autobuz) {
		if(!(autobuz.getStare() instanceof StareLaCapatDeLinie)) {
			System.out.println("Autobuzul cu numarul "+autobuz.getNrAutobuz()+" a ajuns la capat de linie!");
			autobuz.setStare(this);
		}
		
	}

}
