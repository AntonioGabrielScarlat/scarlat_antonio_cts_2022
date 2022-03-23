package seminar_cts4_FactoryMethod;

public class FactoryTramvai implements FactoryMijlocTransportComun{

	@Override
	public MijlocTransportComun creareMijloc(String nrInmatriculare) {
		
		return new Tramvai(nrInmatriculare);
		
	}

}
