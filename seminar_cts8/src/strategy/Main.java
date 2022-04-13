package strategy;

public class Main {

	public static void main(String[] args) {
		Validator validator=new Validator(5, new CardBancar());
		validator.platesteCalatorie();
		validator.setModPlata(new CardCalatorii());
		validator.platesteCalatorie();
		validator.setModPlata(new SMS());
		validator.platesteCalatorie();
	}

}
