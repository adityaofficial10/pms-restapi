package com.wellsfargo.training.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.training.pms.model.Product;
import com.wellsfargo.training.pms.repository.ProductRepository;

import jakarta.transaction.Transactional;

/* @Service annotation allows developers to add business functionalities.
 *  @Transactional annotation allows to manage Database transactions efficiently */
@Service
@Transactional
public class ProductService {
	
	@Autowired  // Dependency Injection - Loose Coupling
	private ProductRepository prepo;
	
	public Product saveProduct(Product p) {
		return prepo.save(p); // invokes predefined save() method of JPA Repository.
	}
	
	public List<Product> listAll(){
		return prepo.findAll(); // defined in JPA Repository to fetch all the data entries.
	}
}
