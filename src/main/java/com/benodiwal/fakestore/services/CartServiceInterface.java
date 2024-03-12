package com.benodiwal.fakestore.services;

import java.time.LocalDate;

import com.benodiwal.fakestore.dtos.CartFetchDTO;

public interface CartServiceInterface {
    public CartFetchDTO[] getCarts();
    public CartFetchDTO getCart(Long id);
    public CartFetchDTO[] getCartsInADateRange(LocalDate startDate, LocalDate endDate);
    public CartFetchDTO[] getCartsByUserId(Long userId);
}
