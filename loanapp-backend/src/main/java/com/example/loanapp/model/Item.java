package com.example.loanapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@Column(name="item_id")
	private int itemId;
	
	@Column
	private boolean issueStatus;
	
	@Column(name="item_description", length=50, nullable=false)
	private String itemDescription;
	
	//Same as loan type
	@Column(name="item_category",length=30, nullable=false)
	private String itemCategory;
	
	@Column(name="item_make")
	private String itemMake;
	
	@Column(name="item_value", nullable=false)
	private int itemValue;
}
