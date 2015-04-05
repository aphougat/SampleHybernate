package com.springapp.mvc.dao;

import com.springapp.mvc.data.Product;

import java.util.List;

/**
 * Created by abhayphougat on 05/04/15.
 */
public interface ProductDao {

    public int insertRow(Product product);

    public Product getById(int code);

    public List<Product> getAllProducts();

    public int updateProduct(Product product);

    public int deleteProduct(String code);

}
