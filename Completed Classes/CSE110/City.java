public class City {
	private String name;
	private String state;
	private Double highTemp;
	private Double lowTemp;
	public city (String name, String state, Double highTemp, Double lowTemp) {

	}

public String getName() {
	return this.name();
}

public String getState() {
	return this.state();
}

public Double getHighTemp() {
	return this.highTemp;
}

public Double getLowTemp() {
	return this.lowTemp;
}

public static setHighTemp(Double highTemp) {
	this.highTemp = highTemp;
}

public static setLowTemp(Double lowTemp) {
	this.lowTemp = lowTemp;
}

public static printInfo() {
	System.out.printf("%s, %s (High = %.2f, Low = %.2f)\n", getName(), getState(), getHighTemp(), getLowTemp());
}


}