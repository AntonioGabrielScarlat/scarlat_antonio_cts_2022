package chainofresponsability;

public class MetrouHandler extends TransportHandler{

	public MetrouHandler(int limita) {
		super(limita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deplaseazaRequest(int distanta) {
			System.out.println("Merge cu metroul!");
		
	}

}
