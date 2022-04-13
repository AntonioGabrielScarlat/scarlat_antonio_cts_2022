package observer;

import java.util.List;

public abstract class Subject {
	public abstract void aboneaza(Observer observer);
	public abstract void dezbaboneaza(Observer observer);
	public abstract void notify(String mesaj);
	public abstract void pleacaDeLaCapat();
}
