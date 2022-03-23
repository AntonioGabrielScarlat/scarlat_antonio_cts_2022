package seminar_cts4;

public class Main {

	public static void main(String[] args) {
		MijlocTransportComun autobuz=Factory.CreareMijlocTransport(TipMijlocTransport.Autobuz, "B04CTS");
		MijlocTransportComun troleibuz=Factory.CreareMijlocTransport(TipMijlocTransport.Troleibuz, "B10CTS");
		MijlocTransportComun tramvai=Factory.CreareMijlocTransport(TipMijlocTransport.Tramvai, "B1000CTS");
		System.out.println(autobuz.toString());
		System.out.println(troleibuz.toString());
		System.out.println(tramvai.toString());
	}

}
