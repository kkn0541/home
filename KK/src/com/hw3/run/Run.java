package com.hw3.run;

import java.util.ArrayList;
import java.util.List;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product pro = new Product();
		List<Product> pro1 = null;
		
		
	    pro1.add(new Product(1, "dk", 1, 1)) ;
	    
	    for(Product pd : pro1) {
	    	System.out.println(pd);
	    }
		
	
	System.out.println(pro1.get(0));
		
		
		
		
		pro.setPld(11);
	}

}
