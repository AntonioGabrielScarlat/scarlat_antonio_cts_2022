package state;

public class StareLaReparat implements Stare{

	@Override
	public void modificaStare(Autobuz autobuz) {
		if(autobuz.getStare() instanceof StareLaCapatDeLinie) {
			System.out.println("Autobuzul cu numarul "+autobuz.getNrAutobuz()+" a ajuns la reparat!");
			autobuz.setStare(this);
		}
		
	}
	
}
