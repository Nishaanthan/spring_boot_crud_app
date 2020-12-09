package com.nisanthank.crudapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Computer {
    @Id
    private BigInteger computerid;
    private String name;
    private String model;
    private String brand;

    public Computer(){

    }

    public BigInteger getComputerid() {
        return computerid;
    }

    public void setComputerid(BigInteger computerid) {
        this.computerid = computerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
