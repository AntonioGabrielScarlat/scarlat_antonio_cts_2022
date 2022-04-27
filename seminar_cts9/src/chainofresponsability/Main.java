package chainofresponsability;

public class Main {

	public static void main(String[] args) {
		TransportHandler troleibuzHandler=new TroleibuzHandler(3);
		TransportHandler autobuzHandler=new AutobuzHandler(5);
		TransportHandler tramvaiHandler=new TramvaiHandler(10);
		TransportHandler metrouHandler=new MetrouHandler(1000);
		
		troleibuzHandler.setTransportHandler(autobuzHandler);
		autobuzHandler.setTransportHandler(tramvaiHandler);
		tramvaiHandler.setTransportHandler(metrouHandler);
		
		troleibuzHandler.deplaseazaRequest(2);
		troleibuzHandler.deplaseazaRequest(4);
		troleibuzHandler.deplaseazaRequest(7);
		troleibuzHandler.deplaseazaRequest(15);
		
		TransportHandler autobuzArad=new AutobuzHandler(1000);
		TransportHandler tramvaiArad=new TramvaiHandler(2);
		
		tramvaiArad.setTransportHandler(autobuzArad);
		
		tramvaiArad.deplaseazaRequest(1);
		tramvaiArad.deplaseazaRequest(5);
	}

}
