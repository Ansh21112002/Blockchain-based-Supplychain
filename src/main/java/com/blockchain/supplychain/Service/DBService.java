package com.blockchain.supplychain.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.blockchain.supplychain.POJO.Medicine;
import com.blockchain.supplychain.Repository.MedicineRepo;

@Service
public class DBService {

    @Autowired
    MedicineRepo repo;

    
    public List<Medicine> getMedService() {
        
        return repo.findAll();
    }

    
    public Medicine postMedService(@RequestBody Medicine medicine) {
        
        return repo.save(medicine);
    }
    
    
}
