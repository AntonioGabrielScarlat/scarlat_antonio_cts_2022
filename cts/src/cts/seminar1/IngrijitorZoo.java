package cts.seminar1;

public class IngrijitorZoo {
	private String nume;
	private String hrana;
	public void hranesteAnimal(Animal animal, String hrana) {
		animal.mananca(hrana);
	}
	public IngrijitorZoo(String nume) {
		super();
		this.nume = nume;

	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getHrana() {
		return hrana;
	}
	public void setHrana(String hrana) {
		this.hrana = hrana;
	}
	
}
