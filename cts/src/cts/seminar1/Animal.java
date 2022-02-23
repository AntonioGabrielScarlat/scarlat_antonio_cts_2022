package cts.seminar1;

public abstract class Animal {
	private String nume;
	
	public abstract void mananca (String hrana);

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Animal(String nume) {
		super();
		this.nume = nume;
	}
	
	
}
