package com.jd.java8.streamapi;

public class Item {

	Double price;
	String product;
	Integer count;

	public Item(Double price, String product, Integer count) {
		super();
		this.price = price;
		this.product = product;
		this.count = count;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
