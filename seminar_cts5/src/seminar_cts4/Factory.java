package seminar_cts4;

public class Factory {
public static MijlocTransportComun CreareMijlocTransport(TipMijlocTransport tipMijlocTransport, String nrInmatriculare) {
	switch(tipMijlocTransport) {
	case Autobuz:
		return new Autobuz(nrInmatriculare);
	case Troleibuz:
		return new Troleibuz(nrInmatriculare);
	case Tramvai:
		return new Tramvai(nrInmatriculare);
		default:
		return null;
	}
}
}
