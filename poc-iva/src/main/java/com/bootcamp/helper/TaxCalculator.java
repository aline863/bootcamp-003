package com.bootcamp.helper;

public class TaxCalculator {

	private double IVA_RATE;

	public TaxCalculator(double IVA_RATE) {
		this.IVA_RATE = IVA_RATE;
	}

	public double calculateIva(double price) {
	
		if(price < 0) {
			return 0;
		}
		else if(price == 0) {
			return 0;
		}
		else {
			return price * IVA_RATE / 100;
		}		
	}
}
