package memento;

public class Autobuz {
	private String numeSofer;
	private int consumMediu;
	private String model;
	private int nrLocuri;
	
	
	
	public Autobuz(String numeSofer, int consumMediu, String model, int nrLocuri) {
		super();
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
		this.model = model;
		this.nrLocuri = nrLocuri;
	}

	public AutobuzMemento salvareMemento() {
		return new AutobuzMemento(numeSofer, consumMediu);
	}
	
	public void undoToMemento(AutobuzMemento autobuzMemento) {
		this.numeSofer=autobuzMemento.getNumeSofer();
		this.consumMediu=autobuzMemento.getConsumMediu();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [numeSofer=");
		builder.append(numeSofer);
		builder.append(", consumMediu=");
		builder.append(consumMediu);
		builder.append(", model=");
		builder.append(model);
		builder.append(", nrLocuri=");
		builder.append(nrLocuri);
		builder.append("]");
		return builder.toString();
	}

	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	public void setConsumMediu(int consumMediu) {
		this.consumMediu = consumMediu;
	}
	
	
	
	
}
