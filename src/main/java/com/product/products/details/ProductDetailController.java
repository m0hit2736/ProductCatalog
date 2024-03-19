package com.product.products.details;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetailController {
	@Autowired
	ProductDetailService service;

	@MutationMapping
	public ProductDetails addProductDetails(@Argument ProductDetails productDetails) {
		return service.addProductDetail(productDetails);

	}

	@MutationMapping
	public ProductDetails updateProductDetails(@Argument ProductDetails productDetails) {

		return service.updateProductDetail(productDetails);

	}

	@QueryMapping
	public Optional<ProductDetails> getProductDetails(@Argument int pdId) {

		return service.getProductDetail(pdId);

	}

	@QueryMapping
	public Iterable<ProductDetails> getAllProductDetails() {

		return service.getAllProductDetail();

	}

	@MutationMapping
	public void deleteProductDetails(@Argument int pdId) {

		service.deleteProductDetail(pdId);
	}
}
