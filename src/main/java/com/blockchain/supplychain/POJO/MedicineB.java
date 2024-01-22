package com.blockchain.supplychain.POJO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MedicineB {

    private String itemName;
    private String mfgDate;
    private String expiryDate;
    private String batchNo;
    private int numberOfItem;
    private String history;
    private int parent;

    


    
}