package com.example.dbcourseworkLipovetskii.ViewEntities;


import com.example.dbcourseworkLipovetskii.DatabaseEntities.Orders.Order;


public class OrderViewEntity {

    long orderNumber;
    String customerName;
    String productName;
    String spareParts;
    int price;

    void createOrderViewEntity(Order order,String spareParts) {
        this.orderNumber = order.getOrderNumber();
        this.customerName = order.getCustomer().getName();
        this.productName = order.getProduct().getName();
        this.price = order.getPrice();
        this.spareParts = spareParts;
    }

}
