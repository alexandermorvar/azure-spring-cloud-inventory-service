### Overview
This application is developed as part of the [Introduction to Azure Spring Cloud](). 

Inventory Service will receive a request to update the inventory. It will look for a Feature Flag value in a configuration file and based on the value, the inventory data in the Cosmos DB will be updated. 

Inventory Service will make use of Service Registry (Eureka), Config Server (Git) and Cosmos DB binding features of Azure Spring Cloud.

More details about the application can be found in the documentation @ [Introduction to Azure Spring Cloud]()