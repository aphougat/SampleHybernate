package com.springapp.mvc.services.impl;

import com.springapp.mvc.dao.ProductDao;
import com.springapp.mvc.data.Product;
import com.springapp.mvc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by abhayphougat on 05/04/15.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;
    @Override
    public int insertRow(Product product) {
        return 0;
    }

    @Override
    public Product getById(int code) {
        return productDao.getById(code);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @Override
    public int updateProduct(Product product) {
        return 0;
    }

    @Override
    public int deleteProduct(String code) {
        return 0;
    }
}
