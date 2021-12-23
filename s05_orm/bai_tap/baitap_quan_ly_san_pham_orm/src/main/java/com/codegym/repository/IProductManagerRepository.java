package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface IProductManagerRepository {
    List<Product> getProdutList();

    void saveNewProduct(Product product);

    void deleteProduct(int id);

    Product findById(int id);

    void editProduct(Product product);
}
