Hystrix:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	microservice-consumer-movie-ribbon-hystrix
2.go http://127.0.0.1:8010/user/1, to see avaliable user.
3.stop microservice-provider-user-1.0-SNAPSHOT.jar
4.go http://127.0.0.1:8010/user/1, to see outline default user.

Health:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	microservice-consumer-movie-ribbon-hystrix
2.go 
	http://127.0.0.1:8010/user/1, to see avaliable user.
	http://127.0.0.1:8010/health, to see server status.
3.stop microservice-provider-user-1.0-SNAPSHOT.jar
4.go http://127.0.0.1:8010/health, to see server status.