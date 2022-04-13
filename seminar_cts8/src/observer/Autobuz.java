package observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Autobuz extends Subject{
	private Set<Observer> observeri;
	private int nrLinie;
	
	

	public Autobuz(int nrLinie) {
		super();
		this.observeri = new HashSet<Observer>();
		this.nrLinie = nrLinie;
	}

	@Override
	public void aboneaza(Observer observer) {
		observeri.add(observer);
	}

	@Override
	public void dezbaboneaza(Observer observer) {
		observeri.remove(observer);
	}

	@Override
	public void notify(String mesaj) {
		for(Observer observer:observeri) {
			observer.primesteMesaj(nrLinie+" "+mesaj);
		}
		
	}
	
	public void pleacaDeLaCapat() {
		notify("Autobuzul cu numarul "+nrLinie+" pleaca de la capat de linie!");
	}
	
}
