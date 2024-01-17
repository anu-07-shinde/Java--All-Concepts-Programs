package com.main;

import com.makeproduct.MakeProduct;
import com.makeproduct.MakeProductSecond;
import com.product.Laptop;
import com.product.Mobile;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("**************************//// MOBILES ////*********************************");
		System.out.println();
		
		Mobile m1 = MakeProduct.createFirstProduct();
		m1.DisplayInformation();
		
		System.out.println();
		System.out.println("****************************************************************************");
		System.out.println();
		
		
		Mobile m2 = MakeProduct.createSecondProduct();
		m2.DisplayInformation();

		System.out.println();
		System.out.println("****************************************************************************");
		System.out.println();
		
		Mobile m3 = MakeProduct.createThirdProduct();
		m3.DisplayInformation();
		
		System.out.println();
		System.out.println("****************************************************************************");
		System.out.println();
		
		Mobile m4 = MakeProduct.createFourthProduct();
		m4.DisplayInformation();
		
		
		System.out.println();
		System.out.println("*********************************//// LAPTOPS ////***************************");
		System.out.println();
		
		
		Laptop l1 = MakeProductSecond.createFirstProduct();
		l1.DisplayInformationOfLaptop();
		
		
		System.out.println();
		System.out.println("****************************************************************************");
		System.out.println();
		
		
		Laptop l2 = MakeProductSecond.createSecondProduct();
		l2.DisplayInformationOfLaptop();
				
		
		System.out.println();
		System.out.println("****************************************************************************");
		System.out.println();
		
		
		Laptop l3 = MakeProductSecond.createThirdProduct();
		l3.DisplayInformationOfLaptop();
				
		
		System.out.println();
		System.out.println("****************************************************************************");
		System.out.println();
		
		
		Laptop l4 = MakeProductSecond.createFourthProduct();
		l4.DisplayInformationOfLaptop();
				
	}
	
}
