package com.product.products;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j;

@SpringBootTest
@Log4j
class ProductServiceImplTest {

	@InjectMocks
	private ProductServiceImpl productServiceImpl;

	@Mock
	private ProductDao dao;

	@Test
	void testGetProductByCode() {
		Product product = new Product();
		product.setProductCode(1);
		product.setProductName("cell phone");
		when(dao.findById(anyInt())).thenReturn(Optional.of(product));
		assertEquals(Optional.of(product), productServiceImpl.getProductByCode(1));
		log.info("Test Case ran successfully");
	}
}
