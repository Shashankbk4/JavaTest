package com.fmc.jpademo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fmc.jpademo1.pojo.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
