package com.eksad.latihanspringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eksad.latihanspringmvc.model.Product;

public interface ProductRepositoryDao extends JpaRepository<Product, Long> {

}

