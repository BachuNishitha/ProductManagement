package com.productmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productmanagement.model.Product;
import com.productmanagement.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
@Autowired
private ProductRepository rep;
public List<Product> listAll(){
return rep.findAll();
}
public Optional<Product> findProductById(Long idproduct) {
return rep.findById(idproduct);
}
public void saveProduct(Product product) {
	rep.save(product);
}
public void deleteproduct(Long idproduct) {
	rep.deleteById(idproduct);
}
public void save(Product product) {
	rep.save(product);
	
}
}