package com.solstice.azure.springcloud.inventory;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "spring.zipkin.sender")
@Data
public class InventoryConfiguration {
    private String type;
}
