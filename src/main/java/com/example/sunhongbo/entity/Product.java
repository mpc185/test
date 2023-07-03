package com.example.sunhongbo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Product {
    public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	private int productId;
    private String productName;
    private int productStock;
    
    
}
