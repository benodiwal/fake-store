# Cart Service

## API Endpoints

### `products`
- Get all products
    ```http
    GET /products/
    ```
    ![GET products](.github/assets/image-7.png)

- Get Product by ID
    ```http
    GET /products/{id}/
    ```
    ![GET product by ID](.github/assets/image-6.png)

### `carts`
- Get all carts
    ```http
    GET /carts/
    ```
    ![GET carts](.github/assets/image.png)

- Get Cart by ID
    ```http
    GET /carts/{id}/
    ```
    ![GET Cart by ID](.github/assets/image-1.png)
- Get Carts in a Date Range
    ```http
    GET /carts?startdate={startdate}&enddate={enddate}
    ```
    ![GET Carts in a Date Range](.github/assets/image-2.png)
- Add products to cart
    ```http
    POST /carts

    {
        "userId": 1,
        "date": "2019-12-10",
        "products": [
            {
                "productId": 1,
                "quantity": 200
            }
        ]
    }
    ```
    ![POST Products to cart](.github/assets/image-3.png)
- Update products in a cart
    ```http
    PUT /carts/{id}

    {
        "userId": 1,
        "date": "2019-12-10",
        "products": [
            {
                "productId": 1,
                "quantity": 200
            }
        ]
    }
    ```
