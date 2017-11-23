1.first go to project with console: mvn clean package -DsipTests
2.fix hosts
127.0.0.1 peer1 peer2
3.run jar
java -jar microservice-discovery-eureka-ha-1.0-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar microservice-discovery-eureka-ha-1.0-SNAPSHOT.jar --spring.profiles.active=peer2
4.go to http://peer1:8761, the registered-replicas has peer2
go to http://peer2:8762, the registered-replicas has peer1
5.ha client
modify the yml with below:
eureka:
    client:
        service-url:
            default-zone: http://peer1:8761/eureka/, http://peer2:8762/eureka/