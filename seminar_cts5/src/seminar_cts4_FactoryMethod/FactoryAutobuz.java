package seminar_cts4_FactoryMethod;

public class FactoryAutobuz implements FactoryMijlocTransportComun{

	@Override
	public MijlocTransportComun creareMijloc(String nrInmatriculare) {
		
		return new Autobuz(nrInmatriculare);
	}

}
