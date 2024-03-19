package com.product.products;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;

	@Override
	public Product addProduct(Product product) {
		return dao.save(product);
	}

	@Override
	public Optional<Product> getProductByCode(int productCode) {
		return dao.findById(productCode);
	}

	@Override
	public Iterable<Product> getAllProduct() {

		return dao.findAll();
	}

	@Override
	public Product updateProduct(Product product) {

		return dao.save(product);
	}

	@Override
	public String deleteProduct(int productCode) {

		dao.deleteById(productCode);
		return "Deleted Succesfully";
	}
}
