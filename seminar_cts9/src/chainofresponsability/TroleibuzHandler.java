package chainofresponsability;

public class TroleibuzHandler extends TransportHandler{

	public TroleibuzHandler(int limita) {
		super(limita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deplaseazaRequest(int distanta) {
		if(distanta<super.limita) {
			System.out.println("Merge cu troleibuzul!");
		}
		else {
			transportHandler.deplaseazaRequest(distanta);
		}
		
		
	}

}
