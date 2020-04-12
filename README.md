### Overview
This service was developed as part of the [Introduction to Azure Spring Cloud](https://medium.com/@smoothed9/introduction-to-azure-spring-cloud-part-1-introduction-azure-setup-30fc3ed84f2b) series. 

Inventory Service receives a request to update the inventory. It looks for a Feature Flag value in a Config Server and based on the value, the inventory data in the Azure Cosmos DB is updated. 

Inventory Service will make use of Service Registry (Eureka), Config Server (Git) and Cosmos DB binding features of [Azure Spring Cloud](https://azure.microsoft.com/en-us/services/spring-cloud/).

More details about the service can be found in the documentation @ [Introduction to Azure Spring Cloud — Part 2: Inventory Service](https://medium.com/@smoothed9/introduction-to-azure-spring-cloud-part-2-inventory-service-21ad1d5b0cd)