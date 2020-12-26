package com.example.dbcourseworkLipovetskii.DatabaseEntities.SparePartsDetails;

import com.example.dbcourseworkLipovetskii.DatabaseEntities.Orders.Order;
import com.example.dbcourseworkLipovetskii.DatabaseEntities.SpareParts.SparePart;

import javax.persistence.*;

@Entity
public class SparePartDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long SparePartDetailId;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    Order order;

    @ManyToOne
    @JoinColumn(name = "sparePartId")
    SparePart sparePart;


}
