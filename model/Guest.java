package model;

public class Guest extends User {
	
	public Guest(String name) {
		super(name);
	}
	public void printInfo() {
		System.out.println(name);
	}
	public void readPost() {
		super.readPost();
	}

}
