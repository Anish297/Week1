
import java.util.ArrayList;
import java.util.Iterator;

interface Subject {
	public void registerObserver(Observer o);

	public void unregisterObserver(Observer o);

	public void notifyObservers();
}