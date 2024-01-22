package com.blockchain.supplychain.POJO;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@Document(collection = "products")
public class Medicine {

    private String itemName;
    private String mfgDate;
    private String expiryDate;
    private String batchNo;
    private String currentHistory;
    private int ID;
    private int numberOfItem;


    
}
