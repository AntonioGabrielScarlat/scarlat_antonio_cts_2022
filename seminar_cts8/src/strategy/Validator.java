package strategy;

public class Validator {
	private int pret;
	private ModPlata modPlata;
	
	public Validator(int pret, ModPlata modPlata) {
		super();
		this.pret = pret;
		this.modPlata = modPlata;
	}


	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}


	public void platesteCalatorie() {
		modPlata.plateste(pret);
	}
}
