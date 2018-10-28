package com.venky.product.bo;

import com.venky.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	public Product findProduct(int id);
}
