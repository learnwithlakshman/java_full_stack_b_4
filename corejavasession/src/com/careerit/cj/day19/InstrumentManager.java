package com.careerit.cj.day19;

interface Instrument{
	 void play();
}


class Guitar implements Instrument{

	@Override
	public void play() {

			System.out.println("TINTINTINT TINTINTINTINT ......");
	}
	
	
}
//

//

//


public class InstrumentManager {

	// Generate random number number (1-3) based random number create 1. Guitar 2. Flute 3. Piano and store all object in 
	// array (use factory method to create object)
	
	// Play all the instruments
	
	// Display count of each instrument 
	
	public static void main(String[] args) {
		Instrument[] arr = new Instrument[10];
	}
	
}
