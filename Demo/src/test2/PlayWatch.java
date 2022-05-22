package test2;

class PlayWatch {
	public static void main(String[] args) {
		// Note how inner class object is created inside
		// main()
		SmartWatch sw = new TicWatch("TickWatch E", "Brown", 950, 2.5);

		String str = sw.measureFitness();
		System.out.println(str);
	}
}
