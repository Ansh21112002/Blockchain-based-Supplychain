package com.blockchain.supplychain.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blockchain.supplychain.POJO.Medicine;

public interface MedicineRepo extends MongoRepository<Medicine,String> {
    
}
