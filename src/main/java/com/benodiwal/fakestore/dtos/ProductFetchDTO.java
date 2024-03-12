package com.benodiwal.fakestore.dtos;

public class ProductFetchDTO {
    
    Long productId;
    int quantity;

    

    public ProductFetchDTO(Long productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
