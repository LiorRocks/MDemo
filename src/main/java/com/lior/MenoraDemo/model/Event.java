package com.lior.MenoraDemo.model;

import java.util.List;
import java.util.UUID;

public class Event {
    private UUID id;
    private EventTypeEnum type;
    private long insuredId;
    private List<Product> products;

    public Event() {
    }

    public Event(UUID id, EventTypeEnum type, long insuredId, List<Product> products) {
        this.id = id;
        this.type = type;
        this.insuredId = insuredId;
        this.products = products;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public EventTypeEnum getType() {
        return type;
    }

    public void setType(EventTypeEnum type) {
        this.type = type;
    }

    public long getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(long insuredId) {
        this.insuredId = insuredId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
