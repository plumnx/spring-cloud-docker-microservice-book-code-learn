1.run microservice-discovery-eureka-authenticating
2.go http://localhost:8761 and enter Login Name:user Password:password123
3.client use authenticating-eureka, add below into yml
eureka:
	client:
		serviceUrl:
			defaultZone: http://user@password123@localhost:8761/eureka/