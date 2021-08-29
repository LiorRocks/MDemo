package com.lior.MenoraDemo.db;

import com.lior.MenoraDemo.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
