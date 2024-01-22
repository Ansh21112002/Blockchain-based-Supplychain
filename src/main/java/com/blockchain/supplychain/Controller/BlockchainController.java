package com.blockchain.supplychain.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.blockchain.supplychain.POJO.Medicine;
import com.blockchain.supplychain.POJO.MedicineB;
import com.blockchain.supplychain.Service.DBService;
import com.blockchain.supplychain.Service.SmartContractService;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BlockchainController {



    @Autowired
    DBService repoService;
    @Autowired
    SmartContractService contractService;

    static String from_address="0x11407Bf21784c5B9f89C9eA950DB910891123168";
    static String to_Address="0x1F2aBBAcFab8640EBE693B24eE127f6677Bcc555";

    

    @GetMapping("/getLastIndex")
    public BigInteger getLastIndexService() throws Exception {
        
            return contractService.getLastIndex();
    }

    @GetMapping("/getInventory/{address}")
    public List<Medicine> getInventory(@PathVariable String address) throws Exception{

        return contractService.findProduct(address);
    }

    @PostMapping("/createMeds")
    public String createMeds(@RequestBody MedicineB medicine) throws Exception {


        
        return contractService.createProductService(medicine.getItemName(), medicine.getMfgDate(), medicine.getExpiryDate(), medicine.getBatchNo(), medicine.getNumberOfItem(), medicine.getHistory(),medicine.getParent(), from_address, to_Address);
    }

    
    

    


    // Database
    @GetMapping("/getMeds")
    public List<Medicine> getMeds() {
        
        return repoService.getMedService();
    }

    @PostMapping("/postMeds")
    public Medicine postMeds(@RequestBody Medicine medicine) {
        
        return repoService.postMedService(medicine);
    }
    
       
    
    
}
