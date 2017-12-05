microservice-gateway-zuul:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	java -jar microservice-consumer-movie-ribbon-1.0-SNAPSHOT.jar
	microservice-gateway-zuul
2.go http://127.0.0.1:8040/microservice-consumer-movie/user/1, the request redirect to http://127.0.0.1:8010/user/1
3.go http://127.0.0.1:8040/microservice-provider-user/1, the request redirect to http://127.0.0.1:8000/1

http://ZUUL_HOST:ZUUL_PORT/microservice, the serviceId/** will be redirect to the serviceId 's owner microservice.

microservice-file-upload:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	microservice-file-upload
	microservice-gateway-zuul

2.test small size file upload by curl in microservice-file-upload
curl -F "file=@sanct.log" localhost:8050/upload

3.test small size file upload by curl in microservice-gateway-zuul
curl -v -H "Transfer-Encoding: chunked" -F "file=@sanct.log" http://127.0.0.1:8040/microservice-file-upload/upload

4.test large size file upload by curl in microservice-gateway-zuul
curl -v -H "Transfer-Encoding: chunked" -F "file=@.docker_temp_247545767" http://127.0.0.1:8040/zuul/microservice-file-upload/upload

microservice-gateway-zuul-filter:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	microservice-gateway-zuul-filter
2.go http://127.0.0.1:8040/microservice-provider-user/1, to certifier the filter is being used.
	
microservice-gateway-zuul-aggregation:
1.run
	java -jar microservice-discovery-eureka-1.0-SNAPSHOT.jar
	java -jar microservice-provider-user-1.0-SNAPSHOT.jar
	java -jar microservice-consumer-movie-1.0-SNAPSHOT.jar
	microservice-gateway-zuul-aggregation
2.go http://127.0.0.1:8040/aggregate/1
3.stop microservice-provider-user and microservice-consumer-movie services, go http://127.0.0.1:8040/aggregate/1
	
	
	
	
	
	
	
	
	