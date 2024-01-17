package com.product;


public class Mobile extends Product{

	private String ram;
	private String storage;
	private String battery;
	
	
	public Mobile(String productName, double productOriginalPrice, int productDiscountPer, String productColor,
			String productType, String ram, String storage, String battery) {
		
		
		super(productName, productOriginalPrice, productDiscountPer, productColor, productType);
		
		
		this.ram = ram;
		this.storage = storage;
		this.battery = battery;
	}

	public Mobile()
	{
		super();
	}
	
	public void DisplayInformation()
	{
		System.out.println("MobileName: " + getProductName());
		System.out.println("MobileOriginalPrice: ₹" + getProductOriginalPrice());
		System.out.println("MobileDisPer: " + getProductDiscountPer() + "%");
		System.out.println("MobileRam: " + getRam() + "GB");
		System.out.println("MobileStorage " + getStorage() + "GB");
		System.out.println("MobileBattery: " + getBattery()+ "mAh");
		System.out.println("MobileColor: " + getProductColor());
		System.out.println("MobileType: " + getProductType());
		System.out.println("MobileSellingPrice: ₹" + getSellingPrice());
		
		
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", storage=" + storage + ", battery=" + battery + "]";
	}
	
		
	
}
