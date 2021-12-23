package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductManagerService {
    public List<Product> getProdutList();

    void saveNewProduct(Product product);

    void deleteProduct(int id);

    Product findById(int id);

    void editProduct(Product product);
}
