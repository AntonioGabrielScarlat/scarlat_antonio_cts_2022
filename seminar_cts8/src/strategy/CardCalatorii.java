package strategy;

public class CardCalatorii implements ModPlata{

	@Override
	public void plateste(int suma) {
		System.out.println("Suma de "+suma+" lei a fost platita prin card de calatorii!");
		
	}

}
