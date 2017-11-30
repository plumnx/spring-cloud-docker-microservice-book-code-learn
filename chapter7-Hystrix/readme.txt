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

feign-hystrix-fallback:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	microservice-consumer-movie-feign-hystrix-fallback
2.go http://127.0.0.1:8010/user/1
3.stop microservice-provider-user-1.0-SNAPSHOT.jar
4.go http://127.0.0.1:8010/user/1

feign-hystrix-fallback-factory:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	microservice-consumer-movie-feign-hystrix-fallback-factory
2.go http://127.0.0.1:8010/user/1
3.stop microservice-provider-user-1.0-SNAPSHOT.jar
4.go http://127.0.0.1:8010/user/1, and the dialog which print on the console.

microservice-hystrix-dashboard:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	java -jar microservice-consumer-movie-ribbon-hystrix-1.0-SNAPSHOT.jar
	microservice-hystrix-dashboard
2.go http://127.0.0.1:8010/hystrix.stream
3.go http://127.0.0.1:8030/hystrix

microservice-hystrux-turbine
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	java -jar microservice-consumer-movie-ribbon-hystrix-1.0-SNAPSHOT.jar
	java -jar microservice-consumer-movie-feign-hystrix-fallback-stream-1.0-SNAPSHOT.jar
	java -jar microservice-hystrix-turbine-1.0-SNAPSHOT.jar
	java -jar microservice-hystrix-dashboard-1.0-SNAPSHOT.jar
2.go http://127.0.0.1:8010/user/1
3.go http://127.0.0.1:8020/user/1
3.go http://127.0.0.1:8030/hystrix.stream write the url with: http://127.0.0.1:8031/turbine.stream



