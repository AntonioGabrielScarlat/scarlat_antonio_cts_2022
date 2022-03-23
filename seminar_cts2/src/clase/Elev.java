package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	public Elev() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Elev [clasa=");
		builder.append(clasa);
		builder.append(", tutore=");
		builder.append(tutore);
		builder.append("]\n");
		return builder.toString();
	}
	
	
	
}
