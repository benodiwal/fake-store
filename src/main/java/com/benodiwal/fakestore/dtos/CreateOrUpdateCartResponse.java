package com.benodiwal.fakestore.dtos;

import java.time.LocalDate;

public class CreateOrUpdateCartResponse {
    Long id;
    Long userId;
    LocalDate date;
    ProductFetchDTO[] products;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public ProductFetchDTO[] getProducts() {
        return products;
    }
    public void setProducts(ProductFetchDTO[] products) {
        this.products = products;
    }   

    
}
