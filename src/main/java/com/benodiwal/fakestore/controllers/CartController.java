package com.benodiwal.fakestore.controllers;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.benodiwal.fakestore.dtos.CartFetchDTO;
import com.benodiwal.fakestore.services.CartService;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    
    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    
    @GetMapping("/")
    public CartFetchDTO[] getCarts() {
        return cartService.getCarts();    
    }

    @GetMapping("/{id}")
    public CartFetchDTO getProduct(@PathVariable Long id) {
        return cartService.getCart(id);
    }

    @GetMapping("/")
    public CartFetchDTO[] getCartsInADateRange(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return cartService.getCartsInADateRange(startDate, endDate);
    }

    @GetMapping("/user/{userId}")
    public CartFetchDTO[] getCartsByUserId(@PathVariable Long userId) {
        return cartService.getCartsByUserId(userId);
    }

}
