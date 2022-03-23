package seminar_cts4_FactoryMethod;

public class Main {

	public static void main(String[] args) {
		FactoryMijlocTransportComun factory=new FactoryAutobuz();
		MijlocTransportComun autobuz=factory.creareMijloc("B28CTS");
		factory=new FactoryTramvai();
		MijlocTransportComun tramvai=factory.creareMijloc("B10000CTS");
		factory=new FactoryTroleibuz();
		MijlocTransportComun troleibuz=factory.creareMijloc("B43298498CTS");
		
		System.out.println(autobuz.toString());
		System.out.println(troleibuz.toString());
		System.out.println(tramvai.toString());
		
		factory=new FactoryMicrobuz();
		MijlocTransportComun microbuz=factory.creareMijloc("HAHAHAH");
		System.out.println(microbuz.toString());
	}

}
