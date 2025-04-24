package com.fmc.jpademo1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.jpademo1.pojo.Product;
import com.fmc.jpademo1.repo.ProductRepository;

@Component
public class BaseOperations implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Product("Car",700000,"Black"));
		repo.save(new Product("Bike",100000,"Blue and Black"));
		repo.save(new Product("Bus",3000000,"Red"));
		repo.save(new Product("Bike",70000,"Black"));
		
		Optional<Product> p=repo.findById(2);
		
		if(p.isPresent()) {
			
			System.out.println("product name is :- "+ p.get());
		}
		else {
			System.out.println("no data found");
		}
		
		repo.findAll().forEach((System.out::println));
		
		/*repo.deleteById(1);
		repo.deleteAll();
		repo.deleteAllInBatch();*/
	}

	
}
