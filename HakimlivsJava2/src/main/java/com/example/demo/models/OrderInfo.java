
package com.example.demo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @OneToOne(targetEntity = Orders.class)
    private Orders orders;
    @OneToOne(targetEntity = Product.class)
    private Product product;
    private int quantity;

    public OrderInfo(){}

    public OrderInfo(Orders orders, Product product, int quantity) {
        this.orders = orders;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

