package template;

public class Main {

	public static void main(String[] args) {
		TramvaiAbstract tramvai=new Tramvai();
		tramvai.parcurgeTraseu();
		TramvaiAbstract tramvaiProbe=new TramvaiProbe();
		tramvaiProbe.parcurgeTraseu();

	}

}
