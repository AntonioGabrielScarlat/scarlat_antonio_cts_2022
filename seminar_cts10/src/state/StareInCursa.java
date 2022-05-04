package state;

public class StareInCursa implements Stare{

	@Override
	public void modificaStare(Autobuz autobuz) {
		if(autobuz.getStare() instanceof StareLaCapatDeLinie) {
			System.out.println("Autobuzul cu numarul "+autobuz.getNrAutobuz()+" a plecat in cursa!");
			autobuz.setStare(this);
		}
		
	}

}
