package com.productdetails.productmanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class ProductDetails implements Serializable {
	
	private static final long serialVersionUID = 6541162783907686900L;

	@Id
    @GeneratedValue
    private int id;
	
	@Column
	private String productname;
	
	@Column
	private String productprice;
	
	@Column
	private String currency;
	
	@Version
	private long version;
	
	public ProductDetails() {
		super();
	}

	public ProductDetails(String productname) {
		super();
		this.productname = productname;
	}
	
	public ProductDetails(String productname, String productprice) {
		super();
		this.productname = productname;
		this.productprice = productprice;
	}
	
	public ProductDetails(String productname, String productprice, String currency) {
		super();
		this.productname = productname;
		this.productprice = productprice;
		this.currency = currency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public String getProductprice() {
		return productprice;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
	
	
}
