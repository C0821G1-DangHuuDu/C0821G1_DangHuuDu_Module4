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

    public List<Product> getProdutList() {

        return productManagerRepository.getProdutList();
    }
}
