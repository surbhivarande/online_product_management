package com.product.onlineproductshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineproductshoppingApplication {

	public static void main(String[] args) {
		try {
		SpringApplication.run(OnlineproductshoppingApplication.class, args);
	}
		catch(Exception e) {
			System.out.println(e);
		    System.out.println("Oops!Sorry,Something went to wrong");	
		}
		finally {
		System.out.println("An error has occured requested page not found!");	
		}
		}

}
