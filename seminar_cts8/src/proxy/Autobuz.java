package proxy;

public class Autobuz implements MijlocTransport{

	private int nrCalatori;
	private String marca;
	
	public Autobuz(int nrCalatori, String marca) {
		super();
		this.nrCalatori = nrCalatori;
		this.marca = marca;
	}

	
	public int getNrCalatori() {
		return nrCalatori;
	}


	public void setNrCalatori(int nrCalatori) {
		this.nrCalatori = nrCalatori;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public void opresteInStatie() {
		System.out.println("Autobuzul a oprit in statie!");
	}

}
