package com.product.products;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;

	@MutationMapping
	public Product addProduct(@Argument Product product) {
		return service.addProduct(product);
	}

	@MutationMapping
	public Product updateProduct(@Argument Product product) {
		return service.updateProduct(product);
	}

	@QueryMapping
	public Optional<Product> getProduct(@Argument int productCode) {
		return service.getProductByCode(productCode);
	}

	@QueryMapping
	public Iterable<Product> getAllProduct() {
		return service.getAllProduct();
	}

	@MutationMapping
	public String deleteProduct(@Argument int productCode) {
		service.deleteProduct(productCode);
		return "deleted succesfully";
	}
}
