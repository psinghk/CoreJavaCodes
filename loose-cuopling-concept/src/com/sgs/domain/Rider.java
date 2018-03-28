package com.sgs.domain;

import com.sgs.sevice.Bike;

public class Rider 
{
	 Bike b;

	public Bike getB() {
		return b;
	}

	public void setB(Bike b) {
		this.b = b;
	}
	  public void ride(){
		  b.start();
	  }

}
