package test2;

public abstract class SmartWatch {
	private String Model;
	private String BandColour;
	protected int BatteryCapacity;

	public SmartWatch(String Model, String BandColour, int BatteryCapacity) {
		this.Model = Model;
		this.BandColour = BandColour;
		this.BatteryCapacity = BatteryCapacity;

	}

	// Simple nested inner class
	class Dial {

		int hourHand;
		int minHand;

		public Dial(int hourHand, int minHand) {
			this.hourHand = hourHand;
			this.minHand = minHand;
		}

//		public void Display() {
//			System.out.println("Smart Watch Specification\nModel:" + Model + "\nBand Colour:" + BandColour
//					+ "\nBattary Capacity:" + BatteryCapacity);
//		System.out.println("Dial details hour Hand "+hourHand+" min Hand "+minHand);
	}

	public abstract String measureFitness();

	public String basicDetails() {

		return "Smart Watch Specification\nModel:" + Model + "\nBand Colour:" + BandColour + "\nBattary Capacity:"
				+ BatteryCapacity;
	}

}
