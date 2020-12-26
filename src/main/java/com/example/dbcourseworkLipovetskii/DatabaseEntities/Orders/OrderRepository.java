package com.example.dbcourseworkLipovetskii.DatabaseEntities.Orders;

import com.example.dbcourseworkLipovetskii.DatabaseEntities.Customers.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "select \"name\" from orders where order.orderId =:id",
            nativeQuery = true
    )
    List<String> getSpareParts(@Param("id") long id);
}
