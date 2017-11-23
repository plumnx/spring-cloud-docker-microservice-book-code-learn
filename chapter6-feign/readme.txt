feign:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar --server.port=8001
	microservice-consumer-movie-feign
2.go http://127.0.0.1:8010/user/1

customize:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	microservice-consumer-movie-feign-customizing
2.go http://127.0.0.1:8010/user/1

auth:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	microservice-provider-user-with-auth
2.go http://127.0.0.1:8000/1
	to use user/password1
	to use admin/password2
	
manual：
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	microservice-provider-user-with-auth
	microservice-consumer-movie-feign-manual
2.go 
	http://127.0.0.1:8010/user-user/1
	http://127.0.0.1:8010/user-admin/1
	