package com.codegym.repository.imp;


import com.codegym.model.Product;
import com.codegym.repository.IProductManagerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductManagerRepository implements IProductManagerRepository {

    @Override
    public List<Product> getProdutList() {
        List<Product> productList = BaseRepository.entityManager.createQuery("select p from product p", Product.class).getResultList();
        return productList;
    }

    @Override
    public void saveNewProduct(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public void deleteProduct(int id) {

        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(findById(id));
        entityTransaction.commit();


    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < getProdutList().size(); i++) {
            if (getProdutList().get(i).getId() == id) {
                return getProdutList().get(i);
            }
        }
        return null;
    }

    @Override
    public void editProduct(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }
}
