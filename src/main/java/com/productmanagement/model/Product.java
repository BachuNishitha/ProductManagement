package com.productmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
    
	private Long idproduct;
	private String name;
	private String branch;

	public Product() {
		super();
	}
	public Product(Long idproduct) {
		this.idproduct = idproduct;
	}
	/**
	 * @param idproduct
	 * @param name
	 * @param branch
	 */
	public Product(Long idproduct, String name, String branch) {
		this.idproduct = idproduct;
		this.name = name;
		this.branch = branch;
	}

	public Long getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(Long idproduct) {
		this.idproduct = idproduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	}

