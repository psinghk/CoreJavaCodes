package com.pio.StaticInterface;

public interface Identifiable {

	//String getuserId();
	
	static String validateuserById(String userId) {

		if (userId.length() < 8) {
			return "User is inavalid User";

		} else {
			return "user is Valid User";
		}

	}
}
