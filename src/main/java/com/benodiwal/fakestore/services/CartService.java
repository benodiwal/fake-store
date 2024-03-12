package com.benodiwal.fakestore.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.benodiwal.fakestore.dtos.CartFetchDTO;

@Service
public class CartService implements CartServiceInterface {

    private final String url = "https://fakestoreapi.com/carts";
    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public CartFetchDTO[] getCarts() {
        return restTemplate.getForObject(url, CartFetchDTO[].class);
    }

    @Override
    public CartFetchDTO getCart(Long id) {
        return restTemplate.getForObject(url + "/" + id, CartFetchDTO.class);
    }

    @Override
    public CartFetchDTO[] getCartsInADateRange(LocalDate startDate, LocalDate endDate) {
         return restTemplate.getForObject("?startdate=" + startDate + "&enddate="+endDate, CartFetchDTO[].class);
    }

    @Override
    public CartFetchDTO[] getCartsByUserId(Long userId) {
        return restTemplate.getForObject(url + "/user/" + userId, CartFetchDTO[].class);
    }
    
}
