package com.makeproduct;
import com.product.Laptop;

public class MakeProductSecond {

	public static Laptop createFirstProduct()
	{
		Laptop HP = new Laptop("HP", 47206, 18, "Natural Silver", "Laptop", "4", "Core i3", "14");
		
		return HP;
	}
	
	public static Laptop createSecondProduct()
	{
		Laptop Asus = new Laptop("ASUS", 55990, 30, "Transparent Silver", "Laptop", "8", "Core i3", "14");
		
		return Asus;
	}
	
	public static Laptop createThirdProduct()
	{
		Laptop Apple = new Laptop("Apple", 349900, 10, "Black", "Laptop", "16", " ", "16");
		
		return Apple;
	}
	
	public static Laptop createFourthProduct()
	{
		Laptop Lenovo = new Laptop("Lenovo", 78654, 75, "Transparent Silver", "Laptop", "4", "Core i3", "15.6");
		
		return Lenovo;
	}
	
	
}
