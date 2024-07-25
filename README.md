# StellarResort Booking Application

## Project Overview

The StellarResort Booking Application is a comprehensive system for managing room reservations and services in a resort setting. It allows users to register, search for rooms, book one or multiple rooms, and perform CRUD operations on room services. The backend services are implemented using Spring Boot, with service discovery handled by Eureka Service Registry and inter-service communication facilitated by OpenFeign. PostgreSQL is used for database management, and an API Gateway is implemented using Spring Cloud Gateway to manage and secure API traffic. Swagger is used for API documentation.

## Architecture

- **Spring Boot Microservices**: Separate services for user management, room booking, and room services.
- **Eureka Service Registry**: For service discovery and registration.
- **OpenFeign**: For inter-service communication.
- **Spring Cloud Gateway**: To handle requests and route them to the appropriate services.
- **PostgreSQL**: For persistent data storage.
- **Swagger/OpenAPI**: For API specification and documentation.

## User Stories

### User Registration

- **As a user**, I want to register an account to book rooms and manage my bookings.
- **Acceptance Criteria**:
  - User can register with a unique email and password.
  - User information is stored in the PostgreSQL database.
  - API endpoint for registration is documented in Swagger.

### Room Booking

- **As a user**, I want to book one or more rooms to plan my stay at the resort.
- **Acceptance Criteria**:
  - User can send a list of rooms based on date and type for booking.
  - Booking details are saved in the PostgreSQL database.
  - API endpoint for booking is documented in Swagger.

### Room Services Management

- **As a room service manager**, I want to perform CRUD operations on room services to manage the services offered at the resort.
- **Acceptance Criteria**:
  - Room services can be created, read, updated, and deleted.
  - Room services information is stored in the PostgreSQL database.
  - Proper validation and error handling are implemented for CRUD operations.
  - API endpoints for CRUD operations are documented in Swagger.

## Technical Implementation

- **User Service**: Manages user registration and authentication.
- **Booking Service**: Handles room searching and booking.
- **Room Service**: Manages room details and CRUD operations.
- **Eureka Service Registry**: Service registration and discovery.
- **OpenFeign**: Simplifies inter-service communication using declarative REST clients.
- **Spring Cloud Gateway**: Routes requests to appropriate microservices and handles security and logging.
- **PostgreSQL**: Used for persistent data storage with JPA/Hibernate for ORM.
- **Swagger/OpenAPI**: Generates interactive API documentation with annotations used in Spring Boot controllers.

## Screenshots

## Screenshots 1
![Screenshot 1](path/to/screenshot2.png)<img width="959" alt="application on eurekaserver" src="https://github.com/user-attachments/assets/5b00a60b-90c3-4f83-bd6a-c50049e85a0b">
&nbsp;
&nbsp;
## Screenshots 2
<img width="959" alt="open api" src="https://github.com/user-attachments/assets/ec9a4fed-31c9-4cf5-aeb6-73dcb2814182">
&nbsp;
&nbsp;

## Screenshots 3

<img width="917" alt="room booking" src="https://github.com/user-attachments/assets/abd5be5d-aee2-4181-b6f9-5f2d24117edc">
