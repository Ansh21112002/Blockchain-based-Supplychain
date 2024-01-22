package com.blockchain.supplychain.Service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

import com.blockchain.supplychain.POJO.Medicine;

@Service
public class SmartContractService {

    private Web3j web3j = Web3j.build(new HttpService("HTTP://127.0.0.1:7545"));

    // Credentials of the Ethereum account

    private String contractAddress = "0x10c0a2f5b0244198ECb636D8bE622BF87df36067";
    private GenContract genContract;
    private String pK = "0x82b50127ee1ebd573a38dc414338e7d7a2ec4abc60467a6db1d4783f02fd7200";
    private Credentials credentials = Credentials.create(pK);

    public SmartContractService() {

        this.genContract = GenContract.load(
                contractAddress, web3j, credentials, new DefaultGasProvider());

    }

    public BigInteger getLastIndex() throws Exception {
        return genContract.getLastIndex().send();
    }

    public List<Medicine> findProduct(String address) throws Exception {
        return genContract.findProduct(address).send();
    }

    public String createProductService(String itemName, String mfgDate, String expiryDate, String batchNo,
            int numberOfItem, String history, int parent, String from_address, String to_Address) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProductService'");
    }

    

}
