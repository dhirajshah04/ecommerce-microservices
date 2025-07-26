# E-commerce Microservices

This monorepo contains a full-stack backend system for an e-commerce platform, built using **Spring Boot microservices**.

## 🧱 Services
- `product-service`: Manages product listing, price, description, etc.

## 🧰 Stack
- Java 17 + Spring Boot 3
- PostgreSQL (per service)
- Flyway for schema migrations
- Docker Compose for container orchestration
- Maven

## 📦 Monorepo Structure



## 🚀 Running
Make sure PostgreSQL is running at port 5433 (if using local), or use `docker-compose up` for full isolation.



# E-Commerce Product Service

This project is a **learning microservice** built with Spring Boot and PostgreSQL as part of a hands-on exploration of microservice architecture and best practices.

It demonstrates:
- Clean layered architecture (DTO, Service, Repository, Controller)
- REST API design with Spring Boot
- Database migrations with Flyway
- Docker containerization (planned)
- Service discovery with Eureka (upcoming)
- Secure communication with JWT (upcoming)



### Modules:
- `eureka-server`: Service Discovery
- `product-service`: Manages products
- `api-gateway`: API routing and filtering (coming soon)
- `user-serivice`: Mange Login, Register, Jwt tokens
- More services coming soon...

> Built with Java 17+, Spring Boot 3.3+, Docker, PostgreSQL, and Spring Cloud.


> ⚠️ **Note:** This is a demo/learning project and **not intended for production use** without further enhancements.
