package com.lior.MenoraDemo.service;

import com.lior.MenoraDemo.db.EventRepository;
import com.lior.MenoraDemo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private EventRepository eventRepository;

    public List<Product> getProductsByInsureId(long insureId) {
        return  eventRepository.findProductsByInsuredId(insureId);
    }
}
