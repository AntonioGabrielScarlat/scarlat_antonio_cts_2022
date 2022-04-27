package chainofresponsability;

public abstract class TransportHandler {

	protected TransportHandler transportHandler;
	protected int limita;

	public TransportHandler(int limita) {
		this.transportHandler=null;
		this.limita=limita;
	}

	public void setTransportHandler(TransportHandler transportHandler) {
		this.transportHandler = transportHandler;
	}
	
	public abstract void deplaseazaRequest(int distanta);
}
