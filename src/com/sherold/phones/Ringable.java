package com.sherold.phones;

public interface Ringable {
	// default method for ring (to be overriden)
	public default String ring() {
		return "";
	}
	
	// default method for unlock (to be overriden)
	public default String unlock() {
		return "";
	}
}
