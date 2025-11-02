# 🏥 Spring Hospital Management

A Spring Core project demonstrating **Java-based `@Bean` configuration** using both **constructor-based** and **setter-based dependency injection** for managing hospital, doctors, and equipment.

---

## 📘 Project Overview

This project simulates a **Hospital Management System** built using **Spring Core (Java-based configuration)**.  
It shows how to define and wire beans using `@Configuration` and `@Bean` annotations — without XML or component scanning.

---

## ✨ Features

- ✅ Pure **Java-based Spring configuration** (no XML)
- 🧩 **Constructor Injection** — used for `Doctor` and `Hospital`
- 🔧 **Setter Injection** — used for `Equipment`
- 🏗️ Demonstrates manual bean creation and dependency wiring
- 💡 Ideal for beginners learning Spring Dependency Injection fundamentals

---

## 🧩 Project Structure

src/main/java
│

├── com/cs/hospital_management/beans

│ ├── Doctor.java # Uses constructor injection

│ ├── Equipment.java # Uses setter injection

│ └── Hospital.java # Injects Doctor and Equipment via constructor

│

├── com/cs/hospital_management/cfgs

│ └── AppConfig.java # Defines all beans using @Bean annotation

│

└── com/cs/main

└── MainApp.java # Entry point of the application


---

## ⚙️ Technologies Used

- **Java 17+**
- **Spring Framework 5+**
- **Maven** (for dependency management)
- **Eclipse / IntelliJ IDEA** (recommended IDE)

---

## 🚀 How It Works

1. The `AppConfig` class defines all beans using `@Bean` methods.
2. `Doctor` and `Hospital` beans use **constructor-based injection**.
3. `Equipment` bean uses **setter-based injection** — Spring sets properties after object creation.
4. The `MainApp` class loads the Spring context and displays hospital details.

---

## 🧠 Example Output

Hospital Name: City Care Hospital

Doctor : Dr. Meena Gupta (Cardiologist)

Equipment: ECG Machine (Cost: Rs.250000.0)





