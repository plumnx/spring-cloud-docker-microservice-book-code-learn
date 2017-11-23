common:
    microservice-simple-provider-user
        go  http://localhost:8000/1
    microservice-simple-consumer-movie
        go  http://127.0.0.1:8010/user/1


spring-boot-starter-actuator
    microservice-simple-provider-user
        go  http://127.0.0.1:8000/health
        go  http://127.0.0.1:8000/info
    microservice-simple-consumer-movie
        go  http://127.0.0.1:8010/health