package com.product.products.details.time;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DeliveryDetails {

	@Id
	int pinCode;
	String estimateDays;
}
