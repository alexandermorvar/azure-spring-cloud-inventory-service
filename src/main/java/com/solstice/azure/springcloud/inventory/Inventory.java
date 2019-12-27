package com.solstice.azure.springcloud.inventory;


import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;

@Document(collection = "inventoryCollection")
public class Inventory {
    private String id;
    @PartitionKey
    private String productCategory;
    private String productName;
    private Integer quantity;

    public Inventory(String id, String productCategory, String productName, Integer quantity) {
        this.id = id;
        this.productCategory = productCategory;
        this.productName = productName;
        this.quantity = quantity;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
