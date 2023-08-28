// Implement your City class in this file
public class City {
	private String name;
	private String state;
	private double highTemp;
	private double lowTemp;
	
	public City (String name, String state, double highTemp, double lowTemp) {
		this.name = name;
		this.state = state;
		this.highTemp = highTemp;
		this.lowTemp = lowTemp;

	}

public String getName() {
	return name;
}

public String getState() {
	return state;
}

public double getHighTemp() {
	return highTemp;
}

public double getLowTemp() {
	return lowTemp;
}

public void setHighTemp(double highTemp) {
	this.highTemp = highTemp;
}

public  void setLowTemp(double lowTemp) {
	this.lowTemp = lowTemp;
}

public void printInfo() {
	System.out.printf("%s, %s (High = %.2f, Low = %.2f)\n", getName(), getState(), getHighTemp(), getLowTemp());
}


}