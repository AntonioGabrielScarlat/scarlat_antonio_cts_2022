package cts.seminar1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String nume;
	private IngrijitorZoo ingrijitor;
	private List<Animal> animale;
	
	public Zoo(String nume, IngrijitorZoo ingrijitor) {
		super();
		this.nume = nume;
		this.ingrijitor = ingrijitor;
		this.animale=new ArrayList<Animal>();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public IngrijitorZoo getIngrijitor() {
		return ingrijitor;
	}

	public void setIngrijitor(IngrijitorZoo ingrijitor) {
		this.ingrijitor = ingrijitor;
	}
	
	public void addAnimal(Animal animal) {
		animale.add(animal);
	}
	
	public void hranesteAnimale(String hrana) {
		for(Animal animal:animale){
			ingrijitor.hranesteAnimal(animal,hrana);
		}
	}
	
}
