package com.product.products.details;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.product.products.Product;
import com.product.products.details.time.DeliveryDetails;

import lombok.Data;

@Entity
@Data
public class ProductDetails {

	@Id
	@SequenceGenerator(name = "users_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
	private int pdId;

	private String brand;
	private double price;
	private String color;
	private String size;
	private double discount;
	private String category;
	private String shortDescription;

	@ManyToOne
	@JoinColumn(name = "deliveryDetails", nullable = false)
	private DeliveryDetails deliveryDetails;

	@ManyToOne
	@JoinColumn(name = "productCode", nullable = false)
	private Product product;
}
