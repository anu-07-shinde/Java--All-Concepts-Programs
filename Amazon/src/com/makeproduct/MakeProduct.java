package com.makeproduct;
import com.product.Mobile;

public class MakeProduct {
	
	public static Mobile createFirstProduct()
	{
		Mobile vivo = new Mobile("vivo Y20G", 20000, 10, "Black", "Mobile", "4", "64", "5000");
		
		return vivo;
	}
	
	public static Mobile createSecondProduct()
	{
		Mobile Realme = new Mobile("Realme 7", 23000, 13, "Blue", "Mobile", "4", "64", "4000");
		
		return Realme;
	}
	
	public static Mobile createThirdProduct()
	{
		Mobile Narzo = new Mobile("Narzo 50A Prime", 13499, 15, "Bule", "Mobile", "4", "64", "5000");
		return Narzo;
	}
	

	public static Mobile createFourthProduct()
	{
		Mobile Nokia = new Mobile("Nokia C12", 7499, 13, "Black", "Mobile", "4", "64", "5000");
		return Nokia;
	}
}
