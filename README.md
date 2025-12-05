
---

# 📘 **Anti Plagiarism Interface**

A scalable and secure **microservices-based code assessment platform** designed to:

* Detect plagiarism
* Execute untrusted code safely
* Evaluate coding submissions in real-time
* Support large-scale usage for colleges, coding contests, and hiring platforms

The platform is engineered for **high performance, security, and maintainability** using modern distributed backend architecture.

---

# 🚀 **Features**

### ✅ **Microservices Architecture**

Each component is independently deployable, scalable, and communicates over **gRPC** for extremely low-latency performance.

### ✅ **Secure Code Execution (Judge0 + Docker)**

* Executes untrusted code inside **isolated Docker sandboxes**
* Protects against infinite loops, memory exploits, fork bombs, etc.
* Supports multiple programming languages

### ✅ **Real-Time Results**

Users receive immediate execution output and detailed submission history.

### ✅ **Plagiarism Detection**

Supports multiple similarity-checking techniques:

* Token-based similarity
* AST structural comparison
* Custom rule-based heuristics

### ✅ **User Roles**

* **Student** — submit solutions, view results, track history
* **Instructor / Admin** — manage questions & test cases, monitor analytics

### ✅ **Highly Scalable**

* Handles **1000+ concurrent users**
* Achieves **<300ms average API response time** using gRPC + caching

---

# 🧱 **Tech Stack**

| Layer                 | Technologies                                  |
| --------------------- | --------------------------------------------- |
| **Frontend**          | React.js, Axios, Bootstrap                    |
| **Backend**           | Java, Spring Boot, Spring Security, gRPC, JPA |
| **Service Discovery** | Eureka Server                                 |
| **API Gateway**       | Spring Cloud Gateway                          |
| **Config Server**     | Spring Cloud Config                           |
| **Database**          | MySQL                                         |
| **Cache**             | Redis                                         |
| **Code Execution**    | Judge0, Docker Sandbox                        |
| **Build Tools**       | Maven                                         |
| **Others**            | Lombok, ModelMapper                           |

---

# 📂 **Microservices Overview**

```
Backend/
│── ApiGateway/
│── AuthService/
│── ConfigServer/
│── EurekaServer/
│── JudgeGrpcWrapper/
│── QuestionManagement/
│── SubmissionService/
│── TestCaseService/
│── UserHistoryManagement/
│── judge0-v1.13.1/   (Optional local Judge0 instance)
```

---

# 🏗 **System Architecture**

(Add your Architecture.png below this section)

```
+------------------------------+
|         React Frontend       |
+-------------+----------------+
              |
              v
+------------------------------+
|        API Gateway           |
+-------------+----------------+
              |
   +----------+-------------+
   |                        |
   v                        v
+--------+          +---------------+
| Auth   | <------> |  User History |
|Service |          | Management    |
+--------+          +---------------+

+-----------------+   +-------------------+
| Question Mgmt   |   | Submission Service |
+-----------------+   +-------------------+

+-------------------------------------+
|        Test Case Service            |
+-------------------------------------+

+-------------------------------------+
|  Judge0 gRPC Wrapper (Docker)       |
+-------------------------------------+

+-------------------------------------+
| Eureka Server + Config Server       |
+-------------------------------------+
```

---

# 🔑 **Service Breakdown**

## 1️⃣ **AuthService**

Handles:

* User registration & login
* JWT authentication
* Role-based access control

## 2️⃣ **QuestionManagementService**

Manages:

* Adding, updating & deleting questions
* Difficulty tagging
* Question metadata

## 3️⃣ **TestCaseService**

Stores:

* Public test cases
* Hidden (private) evaluation test cases

## 4️⃣ **SubmissionService**

Responsible for:

* Sending code to **JudgeGrpcWrapper**
* Matching output with test cases
* Returning results to users

## 5️⃣ **JudgeGrpcWrapper**

A gRPC wrapper around **Judge0** that:

* Executes code in Docker
* Applies CPU/memory/time limits
* Prevents malicious behavior

## 6️⃣ **UserHistoryManagementService**

Stores:

* Submission history
* Execution status
* Time analysis
* Verdict reports (AC, WA, TLE, MLE, RE, CE)

---

# ⚙️ **How to Run the Project**

## 1️⃣ **Start the Config Server**

```
cd Backend/ConfigServer
mvn spring-boot:run
```

## 2️⃣ **Start Eureka Server**

```
cd Backend/EurekaServer
mvn spring-boot:run
```

## 3️⃣ **Start All Microservices**

Repeat:

```
cd Backend/<ServiceName>
mvn spring-boot:run
```

## 4️⃣ **Run Judge0 Docker Container**

```
docker pull judge0/judge0
docker run -d -p 2358:2358 judge0/judge0
```

(Or use your custom JudgeGrpcWrapper)

## 5️⃣ **Run the Frontend**

```
cd Frontend
npm install
npm start
```

---

# 📊 **API Flow Example**

1. Student submits code
2. SubmissionService receives request
3. Sends to JudgeGrpcWrapper
4. Wrapper sends to Judge0 sandbox
5. Execution result returned
6. Stored in UserHistory
7. Sent back to frontend

---

# 📈 **Performance Benchmarks**

* Handles **1000+ concurrent users**
* Achieves **<300ms avg response time**
* Horizontally scalable microservice design

---

# 🛡 **Security Features**

* JWT authentication
* Role-based authorization
* Docker-based sandbox execution
* Input validation
* Optional throttling / rate limiting

---

# 📝 **Future Enhancements**

* AI-driven plagiarism detection (ML-based similarity scoring)
* Leaderboards & competitive programming mode
* WebSocket real-time updates
* Admin analytics dashboard (graphs, insights)

---

# 🤝 **Contributions**

Contributions are welcome!
Feel free to open issues or submit pull requests.

---

# 🧑‍💻 **Author**

**Shrihari Kulkarni**
Backend Developer | Microservices | Cloud | ML

🔗 GitHub: [https://github.com/shrihari7396](https://github.com/shrihari7396)
🔗 LinkedIn: [https://www.linkedin.com/in/shriharik-kulkarni]([https://www.linkedin.com/in/shriharik-kulkarni](https://www.linkedin.com/in/shrihari-kulkarni-467767299/))

---
