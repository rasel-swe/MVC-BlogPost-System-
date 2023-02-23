package model;


public class Admin extends User{
	public Admin(String name,String email,String password) {
		super(name,email,password);
	}
	
	public void printInfo() {
		super.printInfo();
	}
	public void readPost() {
		super.readPost();
	}
	public void updatePost() {
		System.out.println("Post updated");
	}
	public void createPost() {
		System.out.println("Post created: "+b1);
	}
	

}
