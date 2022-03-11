package com.productdetails.productmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productdetails.productmanager.dao.ProductDetailsDAO;
import com.productdetails.productmanager.model.ProductDetails;

@Service
public class ProductDetailsService {
	
	@Autowired
    private ProductDetailsDAO userDAO;
	
	
	public List<ProductDetails> getAllUsers() {
		return userDAO.getAllUsers();
	}
	
	public void save(ProductDetails aUser) {
		userDAO.save(aUser);
	}
	
	public void delete(int userId) {
		userDAO.delete(userId);
	}

}
