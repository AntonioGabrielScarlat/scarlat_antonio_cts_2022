package memento;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz("Gigel", 18, "Mercedes", 56);
		ManagerAutobuz managerAutobuz=new ManagerAutobuz();
		managerAutobuz.adaugaMemento(autobuz.salvareMemento());
		System.out.println(autobuz.toString());
		autobuz.setNumeSofer("Andrei");
		System.out.println(autobuz.toString());
		managerAutobuz.adaugaMemento(autobuz.salvareMemento());
		autobuz.setConsumMediu(20);
		System.out.println(autobuz.toString());
		managerAutobuz.adaugaMemento(autobuz.salvareMemento());
		autobuz.undoToMemento(managerAutobuz.getMemento(0));
		System.out.println(autobuz.toString());
	}

}
