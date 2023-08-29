Database design patterns are reusable solutions to common problems that arise while designing a database. There are several design patterns, each with its own unique characteristics and use cases. Here are some examples of database design patterns:

1. **CQRS (Command Query Responsibility Segregation)**: This pattern separates the read and write operations for a data store. It can improve performance, scalability, and security of an application ¹¹¹.
2. **Saga**: This pattern is used to manage data consistency across microservices in distributed transaction scenarios. It is a sequence of transactions that updates each service and publishes a message or event to trigger the next transaction step ¹⁴¹⁵.
3. **Event Sourcing**: This pattern records the full series of actions taken on data in an append-only store instead of storing just the current state of the data in a domain. It can simplify tasks in complex domains, improve performance, scalability, and responsiveness, and maintain full audit trails and history that can enable compensating actions ⁴⁵⁶.
4. **Shared-database-per-service**: In this pattern, the same database is shared by several microservices. It requires careful assessment of the application architecture before adopting this pattern to avoid hot tables (single tables that are shared among multiple microservices). All your database changes must also be backward-compatible ¹⁷.
5. **Database-per-service**: In this pattern, each individual microservice can independently store and retrieve information from its own data store. By deploying this pattern, you choose the most appropriate data stores (for example, relational or non-relational databases) for your application and business requirements ⁷.
