package chainofresponsability;

public class TramvaiHandler extends TransportHandler{

	public TramvaiHandler(int limita) {
		super(limita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deplaseazaRequest(int distanta) {
		if(distanta<super.limita)
		{
			System.out.println("Merge cu tramvai!");
		}
		else {
			transportHandler.deplaseazaRequest(distanta);
		}
		
	}

}
