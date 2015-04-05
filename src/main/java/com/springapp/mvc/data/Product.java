package com.springapp.mvc.data;

import javax.persistence.*;

/**
 * Created by abhayphougat on 05/04/15.
 */
@Entity
@Table (name = "Products")
public class Product {

    @Id
    @GeneratedValue
    private int code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String des;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
