# spring-day-one

# Spring Learning Journey - Day 01

## Overview
This project demonstrates basic concepts of the Spring Framework using XML configuration.

---

## Concepts Covered
- IoC (Inversion of Control)
- Dependency Injection (DI)
- Spring Container (ApplicationContext)
- Beans
- Setter Injection
- Constructor Injection

---

## Technologies Used
- Java
- Spring Framework
- Maven

---

## Project Structure
src/
├── main/
│ ├── java/
│ │ ├── com/main/SpringContext.java
│ │ └── com/springdayone/User.java
│ └── resources/
│ └── beans.xml
pom.xml

---

## How It Works

1. Spring reads `beans.xml`
2. Creates objects (Beans)
3. Injects values:
   - Setter Injection (`user1`)
   - Constructor Injection (`user2`)
4. Beans are retrieved using `ApplicationContext`

---

## How to Run

1. Clone the repository
2. Open in IDE (Eclipse/IntelliJ)
3. Run `SpringContext.java`

---

##  Output


User [userName=Vijay, userId=24]
User [userName=Vijaykumar, userId=28]


---

##  Key Learning

Spring manages object creation and dependency injection, reducing manual coding and improving maintainability.

---

## 🔜 Next Step

Moving to:
Annotation-based configuration (@Component, @Autowired)

---

## Author
Pambali Vijay Kumar
