package cts.seminar1;

public class Girafa extends Animal{

	public Girafa(String nume) {
		super(nume);
	}

	@Override
	public void mananca(String hrana) {
		System.out.println("Girafa "+super.getNume()+" a mancat "+hrana);
	}

}
