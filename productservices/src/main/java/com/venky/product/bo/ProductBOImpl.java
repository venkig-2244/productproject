package com.venky.product.bo;

import com.venky.product.dao.ProductDAO;
import com.venky.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private ProductDAO dao;
	
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.create(product);

	}

	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
