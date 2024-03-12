package com.benodiwal.fakestore.dtos;

import java.time.LocalDate;

public class CreateOrUpdateCartRequest {
    public Long userId;
    public LocalDate date;
    public ProductFetchDTO[] products;

    public CreateOrUpdateCartRequest(Long userId, LocalDate date, ProductFetchDTO[] products) {
        this.userId = userId;
        this.date = date;
        this.products = products;
    }
    
}
