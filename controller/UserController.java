package controller;

import view.LoginForm;
import javax.swing.JOptionPane;
import model.Admin;
import model.BlogPost;
import model.Blogger;
import .Guest;
import model.User;
import java.util.Scanner;




public class UserController {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a,b,c;
		System.out.println("Input blogger name: ");
		a = in.next();
		
		System.out.println("Input blogger email: ");
		b = in.next();
		
		System.out.println("Input blogger password: ");
		c = in.next();
		
		
		String name;
		String password;
		String email;
		Admin a1 = new Admin(name = "Sheikh Rasel",email = "rasel35-604@diu.edu.bd",password = "abcd1234");
		Blogger b1 = new Blogger(a,b,c);
		Guest g1 = new Guest (name = "Rasel");
	
		BlogPost b2 = new BlogPost("aa","bb","cc","1.1.20");
		
		b2.printInfo();
		a1.printInfo();
		b1.printInfo();
		g1.printInfo();
	}
		
		public void checkLogin(String name, String email){
	        
	        if(u.getUsername().equals(username) && u.getPassword().equals(password))
	            JOptionPane.showMessageDialog(null, "Success!");
	        else 
	            JOptionPane.showMessageDialog(null, "wrong!");
		

	    }
		
	

}
