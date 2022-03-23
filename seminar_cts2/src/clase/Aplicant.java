package clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected static Integer pragPunctaj;
	protected String nume;
	protected String prenume;
	protected Integer varsta;
	protected Integer punctaj;
	protected Integer nrProiecte;
	protected String[] denumireProiect;
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public void setVarsta(Integer varsta) {
		this.varsta = varsta;
	}
	public void afiseazaStatus(){
		System.out.println("Aplicantul "+nume+" "+prenume+(punctaj>=pragPunctaj ? "" : "nu")+" a fost acceptat.");
	}
	
	public void setPunctaj(Integer punctaj) {
		this.punctaj = punctaj;
	}
	
	public void setPragPunctaj(Integer pragPunctaj) {
		Aplicant.pragPunctaj=pragPunctaj;
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setDenumiriProiecte(Integer nrProiecte,String[] denumiri) {
		this.nrProiecte = nrProiecte;
		denumireProiect=new String[nrProiecte];
		for(int i=0;i<nrProiecte;i++) {
			denumireProiect[i]=denumiri[i];
		}
	}
	
	public void afiseazaFinantarePeZi(Integer sumaPeZi) {
		System.out.println("Aplicantul "+getNume()+" "+getPrenume()+" primeste "+sumaPeZi+" Euro/zi in proiect.");
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicant [nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nrProiecte=");
		builder.append(nrProiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		builder.append("]\n");
		return builder.toString();
	}
	
	

}
