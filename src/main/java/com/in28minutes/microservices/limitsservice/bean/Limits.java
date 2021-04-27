package com.in28minutes.microservices.limitsservice.bean;

public class Limits {
	private int minimum;
	private int maximum;
	private String name;
	private String address;

	public Limits() {
		super();
	}

	public Limits(int minimum, int maximum) {		
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	

	public Limits(int minimum, int maximum, String name, String address) {	
		this.minimum = minimum;
		this.maximum = maximum;
		this.name = name;
		this.address = address;
	}

	public Limits(String name, String address) {		
		this.name = name;
		this.address = address;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
