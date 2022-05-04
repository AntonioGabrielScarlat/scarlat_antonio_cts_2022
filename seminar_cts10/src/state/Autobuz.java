package state;

public class Autobuz {
	private Stare stare;
	private Integer nrAutobuz;
	public Autobuz(Integer nrAutobuz) {
		super();
		this.nrAutobuz = nrAutobuz;
		this.stare=new StareLaCapatDeLinie();
	}
	public Stare getStare() {
		return stare;
	}
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	public Integer getNrAutobuz() {
		return nrAutobuz;
	}
	public void setNrAutobuz(Integer nrAutobuz) {
		this.nrAutobuz = nrAutobuz;
	}
	
	public void pleacaInCursa() {
		StareInCursa stareInCursa=new StareInCursa();
		stareInCursa.modificaStare(this);
	}
	
	public void ajungeLaCapatDeLinie() {
		StareLaCapatDeLinie stareLaCapatDeLinie=new StareLaCapatDeLinie();
		stareLaCapatDeLinie.modificaStare(this);
	}
	
	public void trimiteInService() {
		StareLaReparat stareLaReparat=new StareLaReparat();
		stareLaReparat.modificaStare(this);
	}
	
	public void scoateDinService() {
		StareLaCapatDeLinie stareLaCapatDeLinie=new StareLaCapatDeLinie();
		stareLaCapatDeLinie.modificaStare(this);
	}
	
}
