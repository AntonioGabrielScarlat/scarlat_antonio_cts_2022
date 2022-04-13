package observer;

public class Calator implements Observer{
	private String nume;

	
	public Calator(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(nume+", "+mesaj);
	}}
