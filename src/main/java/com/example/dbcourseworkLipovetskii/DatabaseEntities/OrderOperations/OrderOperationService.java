package com.example.dbcourseworkLipovetskii.DatabaseEntities.OrderOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderOperationService {
    @Autowired
    private final OrderOperationRepository orderOperationRepository;

    public OrderOperationService(OrderOperationRepository orderOperationRepository) {
        this.orderOperationRepository = orderOperationRepository;
    }
}
