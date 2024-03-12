package com.benodiwal.fakestore.services;

import java.time.LocalDate;

import com.benodiwal.fakestore.dtos.CartFetchDTO;
import com.benodiwal.fakestore.dtos.CreateOrUpdateCartRequest;
import com.benodiwal.fakestore.dtos.CreateOrUpdateCartResponse;
import com.benodiwal.fakestore.dtos.ProductFetchDTO;

public interface CartServiceInterface {
    public CartFetchDTO[] getCarts();
    public CartFetchDTO getCart(Long id);
    public CartFetchDTO[] getCartsInADateRange(LocalDate startDate, LocalDate endDate);
    public CartFetchDTO[] getCartsByUserId(Long userId);
    public CreateOrUpdateCartResponse addNewCart(Long userId, LocalDate date, ProductFetchDTO[] products);
    public void updateCart(Long cartId, Long userId, LocalDate date, ProductFetchDTO[] products);
    public void deleteCart(Long id);
}
