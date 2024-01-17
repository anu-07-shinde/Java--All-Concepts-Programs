package com.product;

public class Product {
	
	private String productName;
	private double productOriginalPrice;
	private int productDiscountPer;
	private String productColor;
	private String productType;
	private double sellingPrice;
	
	
	public Product(String productName, double productOriginalPrice, int productDiscountPer, String productColor,
			String productType) {
		
		
		super();
		this.productName = productName;
		this.productOriginalPrice = productOriginalPrice;
		this.productDiscountPer = productDiscountPer;
		this.productColor = productColor;
		this.productType = productType;
		this.sellingPrice = SellingPriceCalculation();
	}


	public Product() {
		super();
	}
	
	private double SellingPriceCalculation()
	{
		double discount = productOriginalPrice * productDiscountPer / 100;
		sellingPrice = productOriginalPrice - discount;
		return sellingPrice;
	}
	
	

	public double getSellingPrice() {
		return sellingPrice;
	}


	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getProductOriginalPrice() {
		return productOriginalPrice;
	}


	public void setProductOriginalPrice(double productOriginalPrice) {
		this.productOriginalPrice = productOriginalPrice;
	}


	public int getProductDiscountPer() {
		return productDiscountPer;
	}


	public void setProductDiscountPer(int productDiscountPer) {
		this.productDiscountPer = productDiscountPer;
	}


	public String getProductColor() {
		return productColor;
	}


	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productOriginalPrice=" + productOriginalPrice
				+ ", productDiscountPer=" + productDiscountPer + ", productColor=" + productColor + ", productType="
				+ productType + "]";
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
