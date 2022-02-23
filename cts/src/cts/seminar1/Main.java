package cts.seminar1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		IngrijitorZoo ingrijitor=new IngrijitorZoo("Andrei");
		Zoo zoo1=new Zoo("Baneasa", ingrijitor);
		Zebra z1=new Zebra("Rita");
		Zebra z2=new Zebra("Anita");
		Girafa g1=new Girafa("Ginny");
		zoo1.addAnimal(z1);
		zoo1.addAnimal(z2);
		zoo1.addAnimal(g1);
		zoo1.hranesteAnimale("iarba");
	}

}
