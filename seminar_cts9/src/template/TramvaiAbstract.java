package template;

public abstract class TramvaiAbstract {
	public abstract void opresteStatie1();
	public abstract void opresteStatie2();
	public abstract void opresteStatie3();
	public abstract void opresteStatie4();
	public abstract void opresteStatie5();
	public abstract void opresteStatie6();
	
	public final void parcurgeTraseu() {
		opresteStatie1();
		opresteStatie2();
		opresteStatie3();
		opresteStatie4();
		opresteStatie5();
		opresteStatie6();
	}
	
	public final void parcurgeTraseuInvers() {
		opresteStatie6();
		opresteStatie5();
		opresteStatie4();
		opresteStatie3();
		opresteStatie2();
		opresteStatie1();
	}
}
