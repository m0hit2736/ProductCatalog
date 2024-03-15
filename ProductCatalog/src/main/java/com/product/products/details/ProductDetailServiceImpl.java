package com.product.products.details;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductDetailServiceImpl implements ProductDetailService {

	@Autowired
	ProductDetailDao dao;

	@Override
	public ProductDetails addProductDetail(ProductDetails productDetails) {
		return dao.save(productDetails);
	}

	@Override
	public Optional<ProductDetails> getProductDetail(int pdId) {
		return dao.findById(pdId);
	}

	@Override
	public Iterable<ProductDetails> getAllProductDetail() {

		return dao.findAll();
	}

	@Override
	public ProductDetails updateProductDetail(ProductDetails productDetails) {

		return dao.save(productDetails);
	}

	@Override
	public String deleteProductDetail(int pdId) {

		dao.deleteById(pdId);
		return "Deleted Succesfully";
	}

}
