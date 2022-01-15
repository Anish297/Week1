import java.util.ArrayList;
import java.util.Iterator;

class WheelData implements Subject {
	String wheelCompany;
	int wheelInches;
	String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	ArrayList<Observer> observerList;

	public WheelData() {
		observerList = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observerList.remove(observerList.indexOf(o));
	}

	@Override
	public void notifyObservers() {
		for (Iterator<Observer> it = observerList.iterator(); it.hasNext();) {
			Observer o = it.next();
			o.update(wheelCompany, wheelInches);
		}
	}

	public int getWheelInches(String model) {
		model = getModel();
		if (model == "Corolla") {
			wheelInches = 15;

		} else if (model == "Prius") {
			wheelInches = 15;
		} else {
			wheelInches = 12;
		}
		return wheelInches;

	}

	public String getWheelCompany(String model) {
		model = getModel();
		if (model == "Corolla") {
			wheelCompany = "Servis";

		} else if (model == "Prius") {
			wheelCompany = "Gulf Tyres ";
		} else {
			wheelCompany = "China Tyres";
		}
		return wheelCompany;
	}

	public void dataChanged() {

		wheelCompany = getWheelCompany(wheelCompany);
		wheelInches = getWheelInches(wheelCompany);

		notifyObservers();
	}
}