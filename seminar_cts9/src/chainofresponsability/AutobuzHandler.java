package chainofresponsability;

public class AutobuzHandler extends TransportHandler{

	public AutobuzHandler(int limita) {
		super(limita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deplaseazaRequest(int distanta) {
		if(distanta<super.limita)
		{
			System.out.println("Merge cu autobuzul!");
		}
		else {
			transportHandler.deplaseazaRequest(distanta);
		}
	}

}
