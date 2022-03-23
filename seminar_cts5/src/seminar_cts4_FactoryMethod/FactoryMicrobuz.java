package seminar_cts4_FactoryMethod;

public class FactoryMicrobuz implements FactoryMijlocTransportComun{

	@Override
	public MijlocTransportComun creareMijloc(String nrInmatriculare) {
		
		return new Microbuz(nrInmatriculare);
	}

}
