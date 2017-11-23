integration eureka with ribbon
1.run
	microservice-discovery-eureka
	microservice-provider-user more than 2 instances
	microservice-consumer-movie-ribbon
2.go http://127.0.0.1:8761
3.go http://127.0.0.1:8010/user/1
4.go http://127.0.0.1:8010/log-user-instance to see load balance

ribbon customize
1.run
	microservice-discovery-eureka
	microservice-provider-user more than 2 instances
	microservice-consumer-movie-ribbon
2.go http://127.0.0.1:8010/log-user-instance to see load balance

ribbon without eureka
1.run
	microservice-simple-provider-user more than 2 instances
		java -jar microservice-simple-provider-user-1.0.0-SNAPSHOT.jar
		java -jar microservice-simple-provider-user-1.0.0-SNAPSHOT.jar --server.port=8001
2.run	
	microservice-consumer-movie-without-eureka
3.go http://127.0.0.1:8010/log-user-instance to see load balance
