package com.sgs.domain;

import com.sgs.sevice.Bike;
import com.sgs.sevice.Impl.Bajaj;
import com.sgs.sevice.Impl.Honda;
import com.sgs.sevice.Impl.Yamha;

public class TestCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Rider r = new Rider();
       Bike b = new Yamha();// here loose coupling happend 
        b.start();                // Bike b can hold either may Honda,yamha,bajaj etc
       //r.setB(b);
      // r.ride();
	}

}
