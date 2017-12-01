microservice-gateway-zuul:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	java -jar microservice-consumer-movie-ribbon-1.0-SNAPSHOT.jar
	microservice-gateway-zuul
2.go http://127.0.0.1:8040/microservice-consumer-movie/user/1, the request redirect to http://127.0.0.1:8010/user/1
3.go http://127.0.0.1:8040/microservice-provider-user/1, the request redirect to http://127.0.0.1:8000/1

http://ZUUL_HOST:ZUUL_PORT/microservice, the serviceId/** will be redirect to the serviceId 's owner microservice.

