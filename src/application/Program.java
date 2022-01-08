package application;

import java.util.Date;

import medel.entities.Department;
import medel.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bobo@gmail.com", new Date(), 3000.0, obj);
		
		
		System.out.println(obj);
		System.out.println(seller);

	}

}
