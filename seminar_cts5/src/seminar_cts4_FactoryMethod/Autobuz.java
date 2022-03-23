package seminar_cts4_FactoryMethod;

public class Autobuz extends MijlocTransportComun{

	public Autobuz(String nrInmatriculare) {
		super(nrInmatriculare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [nrInmatriculare=");
		builder.append(nrInmatriculare);
		builder.append("]");
		return builder.toString();
	}
	

}
