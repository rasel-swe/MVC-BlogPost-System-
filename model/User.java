package model;

public class User extends BlogPost{
	
	protected String name;
	protected String email;
	protected String password;
	
	BlogPost b1 = new BlogPost(name = "aa",description = "bb",userinfo = "cc",date = "11.11.22");

public User(String name,String email,String password) {
	this.name = name;
	this.email = email;
	this.password = password;
}

public User(String name) {
	this.name = name;

}

public void printInfo() {
	System.out.println(name+email+password);
}
public void readPost() {
	System.out.println("Post Reading");
}
}



