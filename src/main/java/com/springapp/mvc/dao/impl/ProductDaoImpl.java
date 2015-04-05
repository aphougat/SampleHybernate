package com.springapp.mvc.dao.impl;

import com.springapp.mvc.dao.ProductDao;
import com.springapp.mvc.data.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by abhayphougat on 05/04/15.
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public int insertRow(Product product) {
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(product);
        tx.commit();
        Serializable id = session.getIdentifier(product);
        session.close();
        return (Integer)id;
    }

    @Override
    public Product getById(int code) {
        Session session = sessionFactory.openSession();
        Product product = (Product)session.load(Product.class,code);
        //session.close();
        return product;

    }

    @Override
    public List<Product> getAllProducts() {

        Session session = sessionFactory.openSession();
        List<Product> products = session.createQuery("from Product").list();
        session.close();
        return products;
    }

    @Override
    public int updateProduct(Product product) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(product);
        tx.commit();
        Serializable id = session.getIdentifier(product);
        session.close();
        return (Integer)id;
    }

    @Override
    public int deleteProduct(String code) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        Product prd = (Product)session.load(Product.class,code);
        session.delete(prd);
        tx.commit();
        Serializable id = session.getIdentifier(prd);
        session.close();
        return (Integer)id;
    }
}
