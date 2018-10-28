package com.venky.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.venky.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDescription("iPhoneX");
		product.setPrice(1000);
		dao.create(product);
		
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("iPhone", result.getName());
	}

}
