package com.blockchain.supplychain.Service;

public class CONSTANTS {

    static final String ABI="[\r\n" + //
    "\t{\r\n" + //
    "\t\t\"inputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"item_name\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"mfg_date\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"expiry_date\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"batch_no\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"numOfItem\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"history\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"int256\",\r\n" + //
    "\t\t\t\t\"name\": \"parent\",\r\n" + //
    "\t\t\t\t\"type\": \"int256\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"address\",\r\n" + //
    "\t\t\t\t\"name\": \"user_address\",\r\n" + //
    "\t\t\t\t\"type\": \"address\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"address\",\r\n" + //
    "\t\t\t\t\"name\": \"to_Address\",\r\n" + //
    "\t\t\t\t\"type\": \"address\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"name\": \"createProduct\",\r\n" + //
    "\t\t\"outputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"stateMutability\": \"nonpayable\",\r\n" + //
    "\t\t\"type\": \"function\"\r\n" + //
    "\t},\r\n" + //
    "\t{\r\n" + //
    "\t\t\"inputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"address\",\r\n" + //
    "\t\t\t\t\"name\": \"person\",\r\n" + //
    "\t\t\t\t\"type\": \"address\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"name\": \"findProduct\",\r\n" + //
    "\t\t\"outputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"components\": [\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"itemName\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"mfgDate\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"expiryDate\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"batchNo\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"current_history\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"ID\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"numberOfItem\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t\t\t}\r\n" + //
    "\t\t\t\t],\r\n" + //
    "\t\t\t\t\"internalType\": \"struct Contract_supplychain.Product[]\",\r\n" + //
    "\t\t\t\t\"name\": \"\",\r\n" + //
    "\t\t\t\t\"type\": \"tuple[]\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"stateMutability\": \"view\",\r\n" + //
    "\t\t\"type\": \"function\"\r\n" + //
    "\t},\r\n" + //
    "\t{\r\n" + //
    "\t\t\"inputs\": [],\r\n" + //
    "\t\t\"name\": \"getLastIndex\",\r\n" + //
    "\t\t\"outputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"stateMutability\": \"view\",\r\n" + //
    "\t\t\"type\": \"function\"\r\n" + //
    "\t},\r\n" + //
    "\t{\r\n" + //
    "\t\t\"inputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"address\",\r\n" + //
    "\t\t\t\t\"name\": \"addr\",\r\n" + //
    "\t\t\t\t\"type\": \"address\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"name\": \"getLastProductId\",\r\n" + //
    "\t\t\"outputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"stateMutability\": \"view\",\r\n" + //
    "\t\t\"type\": \"function\"\r\n" + //
    "\t},\r\n" + //
    "\t{\r\n" + //
    "\t\t\"inputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"productId\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"name\": \"getProductDetails\",\r\n" + //
    "\t\t\"outputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"components\": [\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"itemName\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"mfgDate\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"expiryDate\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"batchNo\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"current_history\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"ID\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t\t\t},\r\n" + //
    "\t\t\t\t\t{\r\n" + //
    "\t\t\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\t\t\"name\": \"numberOfItem\",\r\n" + //
    "\t\t\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t\t\t}\r\n" + //
    "\t\t\t\t],\r\n" + //
    "\t\t\t\t\"internalType\": \"struct Contract_supplychain.Product\",\r\n" + //
    "\t\t\t\t\"name\": \"\",\r\n" + //
    "\t\t\t\t\"type\": \"tuple\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"stateMutability\": \"view\",\r\n" + //
    "\t\t\"type\": \"function\"\r\n" + //
    "\t},\r\n" + //
    "\t{\r\n" + //
    "\t\t\"inputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"name\": \"products\",\r\n" + //
    "\t\t\"outputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"itemName\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"mfgDate\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"expiryDate\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"batchNo\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"string\",\r\n" + //
    "\t\t\t\t\"name\": \"current_history\",\r\n" + //
    "\t\t\t\t\"type\": \"string\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"ID\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t},\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"numberOfItem\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"stateMutability\": \"view\",\r\n" + //
    "\t\t\"type\": \"function\"\r\n" + //
    "\t},\r\n" + //
    "\t{\r\n" + //
    "\t\t\"inputs\": [],\r\n" + //
    "\t\t\"name\": \"runningProductId\",\r\n" + //
    "\t\t\"outputs\": [\r\n" + //
    "\t\t\t{\r\n" + //
    "\t\t\t\t\"internalType\": \"uint256\",\r\n" + //
    "\t\t\t\t\"name\": \"\",\r\n" + //
    "\t\t\t\t\"type\": \"uint256\"\r\n" + //
    "\t\t\t}\r\n" + //
    "\t\t],\r\n" + //
    "\t\t\"stateMutability\": \"view\",\r\n" + //
    "\t\t\"type\": \"function\"\r\n" + //
    "\t}\r\n" + //
    "]";
    
}
