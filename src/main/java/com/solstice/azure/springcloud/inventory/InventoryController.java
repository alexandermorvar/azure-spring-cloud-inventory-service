package com.solstice.azure.springcloud.inventory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InventoryController {

    private InventoryRepository repository;
    private InventoryConfiguration inventoryConfiguration;

    public InventoryController(InventoryRepository repository, InventoryConfiguration inventoryConfiguration) {
        this.repository = repository;
        this.inventoryConfiguration = inventoryConfiguration;
    }

    @GetMapping("/inventory")
    public ResponseEntity<List<Inventory>> getInventory() {
        System.out.println("Retrieving inventory");
        List<Inventory> inventories = new ArrayList<>();
        repository.findAll().forEach(inventory -> inventories.add(inventory));
        System.out.println("Inventory retrieved: "+ inventories);
        return new ResponseEntity<>(inventories, HttpStatus.OK);
    }

    @GetMapping("/configuration")
    public ResponseEntity<String> getConfiguration(){
        String type = "";
        if(inventoryConfiguration != null) {
            type = inventoryConfiguration.getType();
            System.out.println("Zipkin Type from Config: " +type);
        } else {
            System.out.println("Did not read from Config Server");
        }
        return new ResponseEntity<>(type, HttpStatus.OK);
    }

    @PostMapping("/inventory")
    public ResponseEntity<String> updateInventory(@RequestBody List<Inventory> inventory) {
        System.out.println("Input: "+inventory.toString());
        inventory.forEach(i -> repository.save(i));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
