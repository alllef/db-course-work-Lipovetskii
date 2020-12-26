package com.example.dbcourseworkLipovetskii.DatabaseEntities.Orders;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public class OrderService {
        @Autowired
        private final OrderRepository orderRepository;

        public OrderService(OrderRepository orderRepository) {
            this.orderRepository = orderRepository;
        }

        public void createOrder(Order order) {
            orderRepository.save(order);
        }

    List<String> getSpareParts(long id){
            return orderRepository.getSpareParts(id);
    }

}
