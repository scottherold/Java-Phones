package com.sherold.phones;

public class IPhone extends Phone implements Ringable {
	// <----- Constructors ----->
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	// <----- Methods ----->
	// Ring override
	@Override
	public String ring() {
		return "iPhone " + getVersionNumber() + " says " + getRingTone();
	}
	
	// Unlock override
	@Override
	public String unlock() {
		return "Unlocking via facial recognition";
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Information for your iPhone:");
		System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());
		System.out.println("Current Battery Charge: " + getBatteryPercentage() + "%");
		
	}
}
