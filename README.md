# Agency

A professional, enterprise-grade web application built to manage agency operations, featuring a dynamic content management system for portfolios, team members, and services. This project follows the **industry-standard MVC architecture** with a heavy focus on **Clean Code** and **Maintainability**.

* **Layered Architecture:** Strict separation of concerns between `Controller`, `Service`, `Repository`, and `Model` layers.
* **Data Integrity:** Implementation of **DTO (Data Transfer Objects)** to ensure internal entities are never directly exposed to the UI, following security best practices.
* **Scalable Design:** The modular structure allows for easy integration of new features (e.g., adding an Admin Dashboard or advanced search filters).

## 🛠️ Technical Implementation

* **Backend:** Spring Boot 3.x with Java 17.
* **Database:** Spring Data JPA for robust ORM and SQL injection protection.
* **UI Rendering:** Thymeleaf with **Literal Substitution** for optimized asset path handling.
* **Boilerplate Reduction:** Project Lombok (`@Data`, `@RequiredArgsConstructor`) to maintain a clean and readable codebase.
* **Form Processing:** Secure `@PostMapping` handling for the Contact module with automatic redirection logic.


## 💎 Clean Code Standards 

I believe that code is read more often than it is written. In this project:
* **Readability:** Logical spacing between class fields, annotations, and methods to reduce cognitive load.
* **Git Excellence:** Professional commit history using conventional prefixes (`feat:`, `fix:`, `docs:`).
* **Naming Conventions:** Clear, descriptive naming for variables and methods that eliminate the need for excessive comments.

## 🚀 Getting Started

1.  **Clone:** `git clone https://github.com/alievaleila/agency.git`
2.  **Configure:** Update `application.properties` with your database credentials.
3.  **Build & Run:** `mvn spring-boot:run`

---
