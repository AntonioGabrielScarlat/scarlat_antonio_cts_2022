package proxy;

public class AutobuzDeNoapte implements MijlocTransport{

	private Autobuz autobuz;
	
	
	public AutobuzDeNoapte(MijlocTransport autobuz2) {
		super();
		this.autobuz = (Autobuz) autobuz2;
	}


	@Override
	public void opresteInStatie() {
		if(autobuz.getNrCalatori()>0)
			autobuz.opresteInStatie();
		else
			System.out.println("Autobuzul nu a oprit in statie!");
		
	}


	@Override
	public int getNrCalatori() {
		return autobuz.getNrCalatori();
	}


	@Override
	public void setNrCalatori(int nrCalatori) {
		autobuz.setNrCalatori(nrCalatori);
		
	}

}
