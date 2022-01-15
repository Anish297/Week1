
public class Main {

	public static void main(String[] args) {

		WheelSuggester wheelSuggester = new WheelSuggester();
		WheelData wheelData=new WheelData();

		wheelData.setModel("Prius");
		
		  
		wheelData.registerObserver(wheelSuggester);
		wheelData.dataChanged();

	}

}
