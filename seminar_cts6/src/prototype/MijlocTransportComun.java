package prototype;

public abstract class MijlocTransportComun implements Cloneable{
 private String numar;

public MijlocTransportComun(String numar) {
	super();
	this.numar = numar;
}

public String getNumar() {
	return numar;
}

public void setNumar(String numar) {
	this.numar = numar;
}
 
public abstract MijlocTransportComun copiaza() throws CloneNotSupportedException ;

}
