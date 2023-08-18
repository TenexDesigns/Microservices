To build microservices with Ruby, you have several options for frameworks, libraries, and technologies. Here are some key points to consider:

1. **Ruby Microservices Frameworks**:
   - [Sinatra](http://sinatrarb.com/): A minimalist web framework that is lightweight and easy to use. It allows you to quickly build APIs and microservices.
   - [Ruby on Rails](https://rubyonrails.org/): A full-featured web framework that includes many tools and conventions for building scalable and maintainable applications. It can be used to build microservices as well.

2. **Ruby Microservices Libraries**:
   - [Mu (µ)](https://github.com/goneflyin/mu-ruby): A gem that provides APIs for building Ruby microservices. It aims to simplify the development of distributed service-oriented architectures.
   - [Sneakers](https://github.com/jondot/sneakers): A library for writing background processing workers in Ruby. It can be used to implement asynchronous communication between microservices using message queues like RabbitMQ.

3. **Microservices Design Patterns**:
   - **Service Registry and Discovery**: Use a service registry (e.g., Consul, etcd) for registering and discovering microservices dynamically.
   - **API Gateway**: Implement an API gateway to handle client requests, authentication, and routing to the appropriate microservices.
   - **Event-Driven Architecture**: Use an event-driven approach with message queues (e.g., RabbitMQ) to decouple microservices and enable asynchronous communication.
   - **Circuit Breaker**: Implement circuit breaker patterns to handle failures and prevent cascading failures in a distributed system.

4. **Technologies Depending on the Language or Framework**:
   - **Ruby**: When building microservices with Ruby, you can use frameworks like Sinatra or Ruby on Rails. You can also utilize libraries like Mu (µ) or Sneakers. Additionally, technologies like RabbitMQ, Consul, or etcd can be used for service discovery and communication.
   - **MongoDB**: If you choose to use MongoDB as the database for your microservices, you can consider using the Mongoid gem as an Object-Document Mapper (ODM) for Ruby.

Remember that the choice of language, framework, and technologies depends on various factors such as the requirements of your project, the team's expertise, and the specific use case for your microservices architecture.

