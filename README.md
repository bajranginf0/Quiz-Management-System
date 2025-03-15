Quiz Management System (Microservices-Based)

Overview

The Quiz Management System is a microservices-based application that allows users to manage quizzes and questions efficiently. It is developed using Spring Boot, Spring Cloud, and Eureka Service Registry.

Tech Stack

Spring Boot (Microservices)

Spring Cloud (Eureka, API Gateway, OpenFeign)

Spring Data JPA

Oracle Database

Hibernate ORM


Microservices Architecture

The system consists of the following microservices:

1. Service Registry (Eureka Server)

Acts as a service registry for all microservices.

Enables dynamic service discovery.

2. API Gateway

Centralized entry point for all microservices.

Handles authentication, authorization, and request routing.

3. Quiz Service

Manages quiz-related operations (Create, Read, Update, Delete quizzes).

Uses REST APIs for communication.

4. Question Service

Handles question-related operations.

Fetches questions based on quiz ID.

Key Features

Microservices Architecture for scalability.

Inter-service communication using Spring Cloud OpenFeign.

Database Persistence using Oracle and Hibernate.

Centralized API Management with Spring Cloud Gateway.

Service Discovery using Eureka Server.

Docker Support for containerized deployment (future scope).

How to Run

Prerequisites

Java 17+

Maven

Oracle Database

Docker (Optional for future deployment)

Steps

Clone the repository

git clone <repository_url>
cd quiz-management-system

Start the Eureka Server

cd service-registry
mvn spring-boot:run

Start the API Gateway

cd api-gateway
mvn spring-boot:run

Start the Quiz and Question Services

cd quiz-service
mvn spring-boot:run

cd question-service
mvn spring-boot:run

Access the Services:

Eureka Server: http://localhost:8761

API Gateway: http://localhost:8080

Quiz Service: http://localhost:9091

Question Service: http://localhost:9092

Future Enhancements

Add Frontend UI using Angular.

Contributors

Bajrang Singh




