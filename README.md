# 26-java-microservices-maven
Three runnable microservices + a shared library, in one Maven multi-module repo (plain JDK, no frameworks).

    shared-lib      library (no main)
    user-service    :8081  /users
    order-service   :8082  /orders
    api-gateway     :8080  /users, /orders (proxies), /health

Build:  mvn package     (fat jars in each module's target/)
Run:    java -jar user-service/target/user-service.jar   (repeat for the other two)
Docker: mvn package && docker compose up --build
Expected for Octiq: THREE runnable modules, no single mainClass at the root. Ambiguous run target.
