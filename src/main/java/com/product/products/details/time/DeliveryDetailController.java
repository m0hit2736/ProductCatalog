package com.product.products.details.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryDetailController {
	@Autowired
	DeliveryDetailService service;

	@MutationMapping
	public DeliveryDetails addDeliveryDetails(@RequestBody DeliveryDetails deliveryDetails) {
		return service.addDeliveryDetails(deliveryDetails);

	}
}
