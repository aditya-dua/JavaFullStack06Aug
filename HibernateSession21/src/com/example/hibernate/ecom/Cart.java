package com.example.hibernate.ecom;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	/*
	 * add item table id
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cart_id",unique=true,nullable=false)
	private Integer id;
	
	@Column(name="customer_name",nullable=false,length=25)
	private String customerName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CART_ITEMS",joinColumns = {@JoinColumn(name="cart_id")},inverseJoinColumns= {@JoinColumn(name="items_id")})
	private Set<Item> items;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", customerName=" + customerName + ", items="
				+ items + "]";
	}

	
	
	
	
	

}
