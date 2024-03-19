package com.product.products.details;

import java.util.Optional;

public interface ProductDetailService {

	ProductDetails addProductDetail(ProductDetails productDetail);

	Optional<ProductDetails> getProductDetail(int pdId);

	Iterable<ProductDetails> getAllProductDetail();

	ProductDetails updateProductDetail(ProductDetails productDetail);

	String deleteProductDetail(int pdId);
}
