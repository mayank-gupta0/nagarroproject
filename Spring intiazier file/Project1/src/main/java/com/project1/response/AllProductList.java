package com.project1.response;

public class AllProductList {
	private String productName;
	private String productDescription;
	private long productPrice;
	private String productBrand;
	private int productCode;
	private String productLocation;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductLocation() {
		return productLocation;
	}
	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}
	public AllProductList(String productName, String productDescription, long productPrice, String productBrand,
			int productCode, String productLocation) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productCode = productCode;
		this.productLocation = productLocation;
	}
	public AllProductList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AllProductList [productName=" + productName + ", productDescription=" + productDescription
				+ ", productPrice=" + productPrice + ", productBrand=" + productBrand + ", productCode=" + productCode
				+ ", productLocation=" + productLocation + "]";
	}
	
	
	
	
	

}
