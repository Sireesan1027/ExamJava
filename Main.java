package test2;


	class Main {
	  public static void main(String[] args) {
		// Note how inner class object is created inside
	        // main()
		  SmartWatch sw=new  TicWatch("Apple","Black",1000);
		  SmartWatch.Dial in = sw.new Dial(60, 10);
	  }
	}
	 

