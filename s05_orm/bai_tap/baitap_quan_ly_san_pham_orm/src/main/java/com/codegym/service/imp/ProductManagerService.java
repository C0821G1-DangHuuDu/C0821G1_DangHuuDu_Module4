package com.codegym.service.imp;

import com.codegym.model.Product;
import com.codegym.repository.IProductManagerRepository;
import com.codegym.repository.imp.ProductManagerRepository;
import com.codegym.service.IProductManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManagerService implements IProductManagerService {
    @Autowired
    private IProductManagerRepository productManagerRepository;

    @Override
    public List<Product> getProdutList() {

        return productManagerRepository.getProdutList();
    }

    @Override
    public void saveNewProduct(Product product) {
        productManagerRepository.saveNewProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
        productManagerRepository.deleteProduct(id);
    }

    @Override
    public Product findById(int id) {
        return  productManagerRepository.findById(id);
    }

    @Override
    public void editProduct(Product product) {
        productManagerRepository.editProduct(product);
    }
}
