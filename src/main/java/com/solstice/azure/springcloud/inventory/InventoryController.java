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

    public InventoryController(InventoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/inventory")
    public ResponseEntity<List<Inventory>> getInventory() {
        System.out.println("Retrieving inventory");
        List<Inventory> inventories = new ArrayList<>();
        repository.findAll().forEach(inventory -> inventories.add(inventory));
        System.out.println("Inventory retrieved: "+ inventories);
        return new ResponseEntity<>(inventories, HttpStatus.OK);
    }

    @PostMapping("/inventory")
    public ResponseEntity<String> updateInventory(@RequestBody Inventory inventory) {
        System.out.println("Input: "+inventory.toString());
        Inventory result = repository.save(inventory);
        System.out.println("Result: "+ result);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
