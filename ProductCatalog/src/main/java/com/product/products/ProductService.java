package com.product.products;

import java.util.Optional;

public interface ProductService {
	Product addProduct(Product product);

	Optional<Product> getProductByCode(int productCode);

	Iterable<Product> getAllProduct();

	Product updateProduct(Product product);

	String deleteProduct(int productCode);
}
