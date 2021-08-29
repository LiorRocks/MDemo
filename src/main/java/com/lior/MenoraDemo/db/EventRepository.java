package com.lior.MenoraDemo.db;

import com.lior.MenoraDemo.model.Event;
import com.lior.MenoraDemo.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {

    List<Product> findProductsByInsuredId(long insuredId);

}
