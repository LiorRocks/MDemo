package com.lior.MenoraDemo.controller;

import com.lior.MenoraDemo.model.Product;
import com.lior.MenoraDemo.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping(path = "/getProductsByInsureId")
    public List<Product> getProductsByInsureId(@RequestParam long insureId) {
        return productsService.getProductsByInsureId(insureId);
    }
}
