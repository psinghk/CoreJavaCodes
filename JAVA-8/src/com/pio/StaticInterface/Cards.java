package com.pio.StaticInterface;

public interface Cards {

	 static void shuffle(){
		 System.out.println("cards Is Shufflings:");
	 }
	
	 default void display(){
		 shuffle();
	 }
}
 