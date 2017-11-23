start flow:
    microservice-discovery-eureka
    microservice-provider-user
    microservice-consumer-movie
    go  http://localhost:8761/

connect service:
    go  http://127.0.0.1:8000/1
    go  http://127.0.0.1:8010/user/1