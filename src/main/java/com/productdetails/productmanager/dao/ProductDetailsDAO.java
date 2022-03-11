package com.productdetails.productmanager.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.productdetails.productmanager.model.ProductDetails;

@Component
public class ProductDetailsDAO {

	@PersistenceContext
	private EntityManager em;
	
	public List<ProductDetails> getAllUsers() {
        TypedQuery<ProductDetails> query = em.createQuery(
        		"SELECT u FROM ProductDetails u ORDER BY u.id", ProductDetails.class);
        return query.getResultList();
    }
	
	@Transactional
	public void delete(int userId) {
		ProductDetails user = em.getReference(ProductDetails.class, userId);
		em.remove(user);
	}
	
	@Transactional
	public void save(ProductDetails aUser) {
		em.persist(aUser);
	}
}
