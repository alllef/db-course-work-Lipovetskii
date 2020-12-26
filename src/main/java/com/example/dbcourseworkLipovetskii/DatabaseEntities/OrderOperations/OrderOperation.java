package com.example.dbcourseworkLipovetskii.DatabaseEntities.OrderOperations;



import com.example.dbcourseworkLipovetskii.DatabaseEntities.Employees.Employee;
import com.example.dbcourseworkLipovetskii.DatabaseEntities.Orders.Order;

import javax.persistence.*;
import java.util.Date;


@Entity
public class OrderOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderOperationId;

    @Temporal(TemporalType.DATE)
    private Date utilDate;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    Order order;

    String status;

    @ManyToOne
    @JoinColumn(name = "EmployeeId")
    Employee employee;

    OrderOperation(){

        utilDate = new Date();
    }
}
