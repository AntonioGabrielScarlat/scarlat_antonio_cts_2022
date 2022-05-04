package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
	List<AutobuzMemento> listaMemento;
	
	
	
	public ManagerAutobuz() {
		super();
		this.listaMemento =new ArrayList<>();
	}



	public void adaugaMemento(AutobuzMemento autobuzMemento) {
		listaMemento.add(autobuzMemento);
	}
	
	public AutobuzMemento getMemento(int index) {
		return listaMemento.get(index);
	}
}
