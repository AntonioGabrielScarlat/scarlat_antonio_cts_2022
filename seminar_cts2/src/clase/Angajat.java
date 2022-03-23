package clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public Angajat() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Angajat [ocupatie=");
		builder.append(ocupatie);
		builder.append(", salariu=");
		builder.append(salariu);
		builder.append("]\n");
		return builder.toString();
	}
	
	
	
	
	
	
}
