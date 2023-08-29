spring.application.name = api-gateway
server.port = 8765


spring.cloud.gateway.discovery.locator.enabled= true
spring.cloud.gateway.discovery.locator.lower-case-service-id=true
  



//----> This line ------spring.cloud.gateway.discovery.locator.enabled= true
// The line above , is used to allow or enable the api gateway to locate the microsrvices through the eureka server




//---> This line-----> spring.cloud.gateway.discovery.locator.lower-case-service-id=true
// The line  above is used to allow the the api gate way to serach for microservices names in lower cased letters  





  
