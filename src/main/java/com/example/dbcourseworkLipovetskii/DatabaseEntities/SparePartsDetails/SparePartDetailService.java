package com.example.dbcourseworkLipovetskii.DatabaseEntities.SparePartsDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SparePartDetailService {
    @Autowired
    private final SparePartDetailRepository sparePartDetailRepository;

    public SparePartDetailService(SparePartDetailRepository sparePartDetailRepository) {
        this.sparePartDetailRepository = sparePartDetailRepository;
    }

    void createRepairPartDetail(SparePartDetail rpd){
        sparePartDetailRepository.save(rpd);
    }

}
