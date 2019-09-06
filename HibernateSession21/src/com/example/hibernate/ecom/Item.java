package com.example.hibernate.ecom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="items_id",unique=true,nullable=false)
	private Integer id;
	
	@Column(name="name",nullable=false,length=25)
	private String name;
	
	@Column(name="description",nullable=false,length=100)
	private String desc;
	
	@Column(name="manf",nullable=false,length=100)
	private String manf;
	
	@Column(name="price",nullable=false)
	private String price;
	
	/*@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart;*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getManf() {
		return manf;
	}

	public void setManf(String manf) {
		this.manf = manf;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	/*public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}*/

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", desc=" + desc
				+ ", manf=" + manf + ", price=" + price + ", cart=" + "]";
	}
	
	
	
	
}
