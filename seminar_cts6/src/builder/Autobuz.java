package builder;

public class Autobuz {
	private String model;
	private String numeSofer;
	private String nrInmatriculare;
	private Boolean stop;
	private Boolean openDoors;
	private String text;
	private Integer nrLinie;
	private Boolean isNew;
	
	
	public Autobuz(String model, String numeSofer, String nrInmatriculare, Boolean stop, Boolean openDoors, String text,
			Integer nrLinie, Boolean isNew) {
		super();
		this.model = model;
		this.numeSofer = numeSofer;
		this.nrInmatriculare = nrInmatriculare;
		this.stop = stop;
		this.openDoors = openDoors;
		this.text = text;
		this.nrLinie = nrLinie;
		this.isNew = isNew;
	}

	public Autobuz(){
	model="Mercedes";
	numeSofer="Dorel";
	nrInmatriculare="B555STB";
	stop=true;
	openDoors=true;
	text="Buna ziua!";
	nrLinie=555;
	isNew=true;
	}
	
	public String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	public String getNumeSofer() {
		return numeSofer;
	}
	void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}
	public String getNrInmatriculare() {
		return nrInmatriculare;
	}
	void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}
	public Boolean getStop() {
		return stop;
	}
	void setStop(Boolean stop) {
		this.stop = stop;
	}
	public Boolean getOpenDoors() {
		return openDoors;
	}
	void setOpenDoors(Boolean openDoors) {
		this.openDoors = openDoors;
	}
	public String getText() {
		return text;
	}
	void setText(String text) {
		this.text = text;
	}
	public Integer getNrLinie() {
		return nrLinie;
	}
	void setNrLinie(Integer nrLinie) {
		this.nrLinie = nrLinie;
	}
	public Boolean getIsNew() {
		return isNew;
	}
	void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [model=");
		builder.append(model);
		builder.append(", numeSofer=");
		builder.append(numeSofer);
		builder.append(", nrInmatriculare=");
		builder.append(nrInmatriculare);
		builder.append(", stop=");
		builder.append(stop);
		builder.append(", openDoors=");
		builder.append(openDoors);
		builder.append(", text=");
		builder.append(text);
		builder.append(", nrLinie=");
		builder.append(nrLinie);
		builder.append(", isNew=");
		builder.append(isNew);
		builder.append("]");
		return builder.toString();
	}
	
	
}
