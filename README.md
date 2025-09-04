# 🧑‍💻 Online Coding Platform Backend (LeetCode-like, Microservices + gRPC)

This project is a **microservices-based backend system** for an online coding practice platform inspired by [LeetCode](https://leetcode.com/).  
It provides features like **problem management, code submission, evaluation, user history, and authentication**.  
The system is built using **Spring Boot**, **gRPC** for inter-service communication, and follows a **microservices architecture** with centralized configuration and service discovery.  

---

## 🚀 Features

- ⚡ **Microservices Architecture**
  - Independent services for Authentication, Problems, Submissions, User History, etc.
  - Highly decoupled and scalable design.

- 🔐 **Authentication & Authorization**
  - JWT-based authentication
  - Role-based access (Admin/User)

- 📝 **Submissions & Judge**
  - Docker-based sandbox for secure code execution
  - gRPC-based Judge service for evaluating code
  - Test case execution with time & memory limits

- ❓ **Problem Management**
  - CRUD APIs for coding problems
  - Categorization by difficulty & tags

- 📜 **User History**
  - Tracks all submissions with verdicts
  - Analytics on user performance

- 🌐 **API Gateway**
  - Unified entry point for all client requests
  - Routing & load balancing

- 🔗 **Service Discovery**
  - Eureka Server for dynamic service registration
  - Config Server for centralized configuration

---

## 🛠️ Tech Stack

- **Framework:** Spring Boot (Java 17+)  
- **Inter-Service Communication:** gRPC  
- **API Gateway:** Spring Cloud Gateway  
- **Service Discovery:** Netflix Eureka  
- **Configuration:** Spring Cloud Config Server  
- **Database:** MySQL / PostgreSQL  
- **Code Execution:** Docker-based Judge (isolated sandbox)  
- **Build Tool:** Maven  
- **Deployment:** Docker & Kubernetes (future-ready)  

---

## 📂 Microservices Structure
ApiGateway/ # Entry point for client requests
AuthService/ # User authentication & JWT
ConfigServer/ # Centralized configuration management
EurekaServer/ # Service discovery
JudgeGrpcWrapper/ # gRPC-based code execution engine
QuestionManagement/ # CRUD operations for problems
SubmissionService/ # Handles code submissions & verdicts
TestCaseService/ # Stores & manages test cases
UserHistoryManagement/ # Tracks user submissions & history


---

## 🔄 System Architecture

```mermaid
graph TD

Client[Frontend / Postman] -->|REST| ApiGateway

subgraph CoreServices
    AuthService -->|JWT| ApiGateway
    QuestionManagement --> ApiGateway
    SubmissionService --> ApiGateway
    UserHistoryManagement --> ApiGateway
end

subgraph Judge
    SubmissionService -->|gRPC| JudgeGrpcWrapper
    JudgeGrpcWrapper -->|Executes Code| DockerSandbox
end

subgraph Infra
    ConfigServer
    EurekaServer
end

CoreServices --> EurekaServer
Judge --> EurekaServer
ApiGateway --> EurekaServer
CoreServices --> ConfigServer
Judge --> ConfigServer
⚙️ Setup & Run
1️⃣ Clone the Repository
git clone https://github.com/your-username/leetcode-microservices-backend.git
cd leetcode-microservices-backend

2️⃣ Start Config & Eureka Servers
cd ConfigServer
./mvnw spring-boot:run

cd ../EurekaServer
./mvnw spring-boot:run

3️⃣ Start Other Services
cd ../AuthService && ./mvnw spring-boot:run
cd ../QuestionManagement && ./mvnw spring-boot:run
cd ../SubmissionService && ./mvnw spring-boot:run
cd ../TestCaseService && ./mvnw spring-boot:run
cd ../UserHistoryManagement && ./mvnw spring-boot:run
cd ../JudgeGrpcWrapper && ./mvnw spring-boot:run
cd ../ApiGateway && ./mvnw spring-boot:run

4️⃣ Access API Gateway
http://localhost:8080

📡 API Endpoints (via API Gateway)
👤 Authentication

POST /auth/register → Register new user

POST /auth/login → Login and get JWT

❓ Problems

GET /problems → Fetch all problems

POST /problems → Create new problem (Admin only)

📝 Submissions

POST /submissions → Submit code

GET /submissions/{userId} → Get user submission history

🧪 Testing
./mvnw test

🚀 Future Improvements

Contest system (like LeetCode Weekly Contests)

Leaderboards & ranking system

Support for additional languages (C++, Python, Java, JS, Go)

Monitoring & logging with Prometheus + Grafana + ELK

CI/CD pipeline with GitHub Actions / Jenkins

Deployment on Kubernetes for scalability

📜 License

This project is licensed under the MIT License.
Feel free to use and modify it for learning & educational purposes.


---

⚡ This is **one complete file** — ready to be committed as `README.md`.  

Would you like me to also generate a **Postman collection JSON file** (`postman_collection.json`) so developers can directly test login, add problem, and submission APIs?




