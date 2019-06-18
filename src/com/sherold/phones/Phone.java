package com.sherold.phones;

public abstract class Phone {
	// <----- Attributes ----->
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	
	// <----- Constructors ----->
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	
	// <----- Methods ----->
	// Abstract method that will be implemented by the subclasses;
	public abstract void displayInfo();
	
	// <----- Getters/Setters ----->
	// versionNumber
	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	// batteryPercentage
	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	// carrier
	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	// ringTone
	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}		
}
