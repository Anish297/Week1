
class WheelSuggester implements Observer {
	private String wheelCompany;
	private int wheelInches;

	public void update(String wheelCompany, int wheelInches) {
		this.wheelCompany = wheelCompany;
		this.wheelInches = wheelInches;
		display();
	}

	public void display() {
		System.out.println("Your Car tyres suggestions are :");

		System.out.println("\nSuggested Wheel Company : " + wheelCompany + "\nSuggested Wheel Inches : " + wheelInches);
	}
}