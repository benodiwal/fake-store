package com.benodiwal.fakestore.dtos;

import java.time.LocalDate;

public class CartFetchDTO {
    Long id;
    Long userId;
    LocalDate date;
    ProductFetchDTO[] products;

    public CartFetchDTO(Long id, Long userId, LocalDate date, ProductFetchDTO[] products) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.products = products;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userid) {
        this.userId = userid;
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
