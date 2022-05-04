package memento;

public class AutobuzMemento {
	private String numeSofer;
	private int consumMediu;
	
	
	
	public AutobuzMemento(String numeSofer, int consumMediu) {
		super();
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
	}
	public String getNumeSofer() {
		return numeSofer;
	}
	public int getConsumMediu() {
		return consumMediu;
	}
	
	
}
