package com.sgs.lang;

final  public class User   {

	private final String userName;
	//public  String s;

	public User(String userName) {

		this.userName = userName;

	}

	/*public void adds(String s){
		 this.s = s;
	 }*/
	public User modifyUser(String userName){

		if(this.userName == userName)
			return this;
		else{
			return new User(userName);

		}

	}

	@Override
	public String toString() {
		return userName;
	}



}
