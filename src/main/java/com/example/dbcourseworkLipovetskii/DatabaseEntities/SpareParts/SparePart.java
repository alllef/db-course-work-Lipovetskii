package com.example.dbcourseworkLipovetskii.DatabaseEntities.SpareParts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SparePart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sparePartId;

    private String name;
    private int quantity;

    public long getSparePartId() {
        return sparePartId;
    }

    public void setSparePartId(long sparePartId) {
        this.sparePartId = sparePartId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
