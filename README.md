# 🧑‍💻 Online Coding Platform Backend (LeetCode-like)

This project is a **backend system for a coding practice platform** similar to [LeetCode](https://leetcode.com/).  
It provides functionality for **user management, problem solving, submissions, history tracking, and evaluation**.  

---

## 🚀 Features

- 👤 **User Management**
  - Register/Login with authentication
  - JWT-based security
  - Role-based access (Admin/User)

- ❓ **Problem Management**
  - CRUD APIs for coding problems
  - Supports multiple difficulty levels (Easy, Medium, Hard)
  - Tagging (e.g., Array, DP, Graphs)

- 📝 **Code Submissions**
  - Submit solutions in multiple languages
  - Compile & run code inside isolated environments (Docker)
  - Real-time execution & result feedback (Accepted, Wrong Answer, TLE, etc.)

- 📜 **User History**
  - Tracks all submissions
  - Stores accepted/wrong attempts
  - Analytics (success rate, streaks, most solved tags)

- ⚡ **Evaluation Engine**
  - Runs submitted code against hidden test cases
  - Time & memory limits
  - Parallel execution for scalability

---

## 🛠️ Tech Stack

- **Backend Framework:** Spring Boot (Java)
- **Database:** MySQL / PostgreSQL
- **Authentication:** Spring Security + JWT
- **Code Execution:** Docker-based sandbox
- **Communication:** REST APIs / gRPC (for microservices)
- **Deployment:** Docker & Kubernetes (future-ready)

---

## 📂 Project Structure

