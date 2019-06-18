package com.sherold.phones;

public class Galaxy extends Phone implements Ringable {
	// <----- Constructors ----->
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	// <----- Methods ----->
	// Ring override
	@Override
	public String ring() {
		return "Galaxy " + getVersionNumber() + " says " + getRingTone();
	}
	
	// Unlock override
	@Override
	public String unlock() {
		return "Unlocking via finger print";
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Information for your Galaxy:");
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
		System.out.println("Current Battery Charge: " + getBatteryPercentage() + "%");
	}
}
