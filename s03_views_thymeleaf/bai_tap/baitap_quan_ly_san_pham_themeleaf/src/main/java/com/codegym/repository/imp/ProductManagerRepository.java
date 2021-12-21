package com.codegym.repository.imp;


import com.codegym.model.Product;
import com.codegym.repository.IProductManagerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductManagerRepository implements IProductManagerRepository {

    @Override
    public List<Product> getProdutList() {
        List<Product> productList = BaseRepository.entityManager.createQuery("select s from product s",Product.class).getResultList();
        return productList;
    }
}
