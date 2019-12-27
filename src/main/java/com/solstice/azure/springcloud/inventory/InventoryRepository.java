package com.solstice.azure.springcloud.inventory;

import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;

public interface InventoryRepository extends DocumentDbRepository<Inventory, String> {
}
