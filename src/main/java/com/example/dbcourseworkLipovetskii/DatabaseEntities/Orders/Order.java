package com.example.dbcourseworkLipovetskii.DatabaseEntities.Orders;

import com.example.dbcourseworkLipovetskii.DatabaseEntities.Customers.Customer;
import com.example.dbcourseworkLipovetskii.DatabaseEntities.Products.Product;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long OrderId;

   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long orderNumber;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name ="customerId")
    private Customer customer;

    private int price;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
   private Product product;

    public Order(Customer customer, int price, Product product) {
        this.customer = customer;
        this.price = price;
        this.product = product;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
