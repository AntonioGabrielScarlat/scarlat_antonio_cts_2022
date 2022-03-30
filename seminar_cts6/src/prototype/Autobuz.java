package prototype;

public class Autobuz extends MijlocTransportComun{
 private String numeSofer;
 
public Autobuz(String numar, String numeSofer) {
	super(numar);
	this.numeSofer = numeSofer;
}

public String getNumeSofer() {
	return numeSofer;
}

public void setNumeSofer(String numeSofer) {
	this.numeSofer = numeSofer;
}

@Override
public MijlocTransportComun copiaza() throws CloneNotSupportedException {
	return (MijlocTransportComun) this.clone();
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Autobuz [numeSofer=");
	builder.append(numeSofer);
	builder.append("]");
	return builder.toString();
}
 

 
}
