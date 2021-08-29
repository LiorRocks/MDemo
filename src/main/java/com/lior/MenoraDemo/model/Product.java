package com.lior.MenoraDemo.model;

import java.util.Date;

public class Product {
    private ProductTypeEnum type;
    private int price;
    private Date startDate;
    private Date endDate;

    public Product() {
    }

    public Product(ProductTypeEnum type, int price, Date startDate, Date endDate) {
        this.type = type;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public ProductTypeEnum getType() {
        return type;
    }

    public void setType(ProductTypeEnum type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
