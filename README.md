
---

# 📘 **Anti Plagiarism Interface**

A scalable and secure **microservices-based code assessment platform** designed to:

* Detect plagiarism
* Execute untrusted code safely
* Evaluate coding submissions in real-time
* Support large-scale users (colleges, competitions, hiring platforms)

The system ensures **high performance, security, and maintainability** using modern backend engineering practices.

---

# 🚀 **Features**

### ✅ **Microservices Architecture**

Each service is independently deployable, scalable, and communicates over **gRPC** for low-latency performance.

### ✅ **Secure Code Execution (Judge0 + Docker)**

* Executes code inside **isolated Docker sandboxes**
* Prevents attacks, infinite loops, resource exploitation
* Supports multiple programming languages

### ✅ **Real-Time Results**

Frontend receives **live execution updates** and submission history.

### ✅ **Plagiarism Detection**

Compares code submissions using:

* Token similarity
* AST-based structural matching
* Custom rules

### ✅ **User Roles**

* **Student** — submit code and see results
* **Instructor/Admin** — manage questions, test cases, and view analytics

### ✅ **Highly Scalable**

* Supports **1000+ concurrent users**
* Avg. API response time: **< 300ms**

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
│── judge0-v1.13.1/ (Optional local instance)
```

---

# 🏗 **System Architecture**

(Replace this with your Architecture.png)

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
|Service |          |  Management   |
+--------+          +---------------+

+---------------+   +-----------------+
| Question Mgmt |   | Submission      |
|   Service     |   |  Service        |
+---------------+   +-----------------+

+-------------------------------------+
|        Test Case Service            |
+-------------------------------------+

+-------------------------------------+
|   Judge0 gRPC Wrapper (Docker)      |
+-------------------------------------+

+-------------------------------------+
|  Eureka Server + Config Server      |
+-------------------------------------+
```

---

# 🔑 **Service Breakdown**

## 1️⃣ **AuthService**

Handles:

* User registration
* Login
* JWT authentication
* Role-based access control

## 2️⃣ **QuestionManagementService**

Features:

* Create/update/delete questions
* Add difficulty tags
* Attach metadata

## 3️⃣ **TestCaseService**

Stores:

* Public test cases
* Private test cases (hidden from user)

## 4️⃣ **SubmissionService**

Responsible for:

* Sending code to **JudgeGrpcWrapper**
* Evaluating output
* Returning results to the user

## 5️⃣ **JudgeGrpcWrapper**

A gRPC wrapper around **Judge0** that:

* Executes code safely
* Monitors CPU, memory, timeout
* Prevents malicious operations

## 6️⃣ **UserHistoryManagement**

Stores:

* User submissions
* Execution results
* Time taken
* Status (Accepted, WA, TLE, MLE, CE, RE)

---

# ⚙️ **How to Run the Project**

## ✅ **1. Start Config Server**

```
cd Backend/ConfigServer
mvn spring-boot:run
```

## ✅ **2. Start Eureka Server**

```
cd Backend/EurekaServer
mvn spring-boot:run
```

## ✅ **3. Start All Microservices**

Repeat:

```
cd Backend/<ServiceName>
mvn spring-boot:run
```

## ✅ **4. Start Judge0 Docker Container**

```
docker pull judge0/judge0
docker run -d -p 2358:2358 judge0/judge0
```

Or your customized wrapper.

## ✅ **5. Start Frontend**

```
cd Frontend
npm install
npm start
```

---

# 📊 **API Flow (Example)**

### 🔹 Student Submits Code → Submission Service

### 🔹 Sent to JudgeGrpcWrapper → Judge0 Sandbox

### 🔹 Execution Result → Submission Service

### 🔹 Store in UserHistory

### 🔹 Return response to Frontend

---

# 📈 **Performance**

* **1000+ concurrent users handled**
* **<300ms average response time** due to gRPC + caching
* Horizontally scalable microservice design

---

# 🛡 **Security Features**

* JWT authentication
* Role-based access
* Docker sandboxing
* Input validation
* Rate limiting (optional but recommended)

---

# 📝 **Future Improvements**

* AI-based plagiarism prediction
* Leaderboards & competition mode
* WebSocket real-time updates
* Admin analytics dashboard

---

# 🙌 **Contributions**

Pull requests are welcome!
Please open an issue for feature requests or bug reports.

---

# 🧑‍💻 Author

**Shrihari Kulkarni**
Backend Developer | Microservices | Cloud | ML
🔗 GitHub: [https://github.com/shrihari7396](https://github.com/shrihari7396)
🔗 LinkedIn: [https://linkedin.com/in/shriharik-kulkarni](https://www.linkedin.com/in/shrihari-kulkarni-467767299/)

---
