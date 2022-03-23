package seminar_cts4_FactoryMethod;

public class Troleibuz extends MijlocTransportComun{

	public Troleibuz(String nrInmatriculare) {
		super(nrInmatriculare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Troleibuz [nrInmatriculare=");
		builder.append(nrInmatriculare);
		builder.append("]");
		return builder.toString();
	}

	
}
