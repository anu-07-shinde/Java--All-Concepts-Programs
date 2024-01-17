 package com.product;

public class Laptop extends Product {
	
	private String ram;
	private String cpuModel;
	private String screenSize;
	
	public Laptop(String productName, double productOriginalPrice, int productDiscountPer, String productColor,
			String productType, String ram, String cpuModel, String screenSize) {
		
		super(productName, productOriginalPrice, productDiscountPer, productColor, productType);
		
		this.ram = ram;
		this.cpuModel = cpuModel;
		this.screenSize = screenSize;
	}
	
	public Laptop()
	{
		super();
	}
	public void DisplayInformationOfLaptop()
	{
		System.out.println("LaptopName: " + getProductName());
		System.out.println("LaptopOriginalPrice: ₹" + getProductOriginalPrice());
		System.out.println("LaptopDisPer: " + getProductDiscountPer() + "%");
		System.out.println("LaptopRam: " + getRam() + "GB");
		System.out.println("LaptopCpuModel: " + getCpuModel() );
		System.out.println("LaptopScreenSize: " + getScreenSize()+ "Inch");
		System.out.println("LaptopColor: " + getProductColor());
		System.out.println("LaptopType: " + getProductType());
		System.out.println("LaptopSellingPrice: ₹" + getSellingPrice());
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	
	
	
	
	
	

}
