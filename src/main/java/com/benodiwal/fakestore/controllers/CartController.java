package com.benodiwal.fakestore.controllers;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.benodiwal.fakestore.dtos.CartFetchDTO;
import com.benodiwal.fakestore.dtos.CreateOrUpdateCartRequest;
import com.benodiwal.fakestore.dtos.CreateOrUpdateCartResponse;
import com.benodiwal.fakestore.services.CartService;

@RestController
public class CartController {
    
    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    
    @GetMapping("/carts/")
    public CartFetchDTO[] getCarts() {
        return cartService.getCarts();    
    }

    @GetMapping("/carts/{id}")
    public CartFetchDTO getProduct(@PathVariable Long id) {
        return cartService.getCart(id);
    }

    @GetMapping("/carts")
    public CartFetchDTO[] getCartsInADateRange(@RequestParam LocalDate startdate, @RequestParam LocalDate enddate) {
        return cartService.getCartsInADateRange(startdate, enddate);
    }

    @GetMapping("/carts/user/{userId}")
    public CartFetchDTO[] getCartsByUserId(@PathVariable Long userId) {
        return cartService.getCartsByUserId(userId);
    }

    @PostMapping("/carts/")
    public CreateOrUpdateCartResponse postAddANewCart(@RequestBody CreateOrUpdateCartRequest body) {
        return cartService.addNewCart(body.userId, body.date, body.products);
    }

    @PutMapping("/carts/{id}")
    public ResponseEntity<HttpStatus> patchUpdateACart(@PathVariable Long id, @RequestBody CreateOrUpdateCartRequest body) {
        cartService.updateCart(id, body.userId, body.date, body.products);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/carts/{id}")
    public ResponseEntity<HttpStatus> deleteCart(@PathVariable Long id) {
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }

}
