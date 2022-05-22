package test2;

public class TicWatch extends SmartWatch {

	public Double acceleroMetre;

	public TicWatch(String model, String bandColour, int batteryCapacity, double acceleroMetre2) {

		super(model, bandColour, batteryCapacity);
		this.acceleroMetre = acceleroMetre2;
	}

	@Override
	public String measureFitness() {
		Dial dial = new Dial(7, 5);
		return super.basicDetails() + "\nAccelero Metre :" + String.valueOf(acceleroMetre) + "\nDial details hour Hand "
				+ dial.hourHand + " min Hand " + dial.minHand;
	}

}
