package seminar_cts4_FactoryMethod;

public class FactoryTroleibuz implements FactoryMijlocTransportComun{

	@Override
	public MijlocTransportComun creareMijloc(String nrInmatriculare) {
		
		return new Troleibuz(nrInmatriculare);
	}

}
