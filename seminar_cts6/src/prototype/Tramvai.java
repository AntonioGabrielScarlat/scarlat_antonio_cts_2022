package prototype;

public class Tramvai extends MijlocTransportComun{
private String numeVatman;

public Tramvai(String numar, String numeVatman) {
	super(numar);
	this.numeVatman = numeVatman;
}

public String getNumeVatman() {
	return numeVatman;
}

public void setNumeVatman(String numeVatman) {
	this.numeVatman = numeVatman;
}

@Override
public MijlocTransportComun copiaza() throws CloneNotSupportedException {
	return (MijlocTransportComun) this.clone();
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Tramvai [numeVatman=");
	builder.append(numeVatman);
	builder.append("]");
	return builder.toString();
}



}
