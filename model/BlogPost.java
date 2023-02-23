package model;

public class BlogPost {
	
	protected String name;
	protected String description;
	protected String userinfo;
	protected String date;

	public BlogPost() {
		
	}

	public BlogPost(String name,String description,String userinfo,String date) {
		this.name = name;
		this.description = description;
		this.userinfo = userinfo;
		this.date = date;
	}

	public void printInfo() {
		System.out.println(name+description+userinfo+date);
	}
	}



