package com.sgs.collection;

import java.util.Comparator;

public class MyComprator implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub

		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		// if (I1 < I2) {
		// return 1;
		// } else if (I1 > I2) {
		// return -1;
		//
		// } else {
		// return 0;
		// }

		// Or

		return -I1.compareTo(I2);

	}

}
