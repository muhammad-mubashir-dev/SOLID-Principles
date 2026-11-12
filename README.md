# 🚀 SOLID Principles in Java

A clean, practical reference implementation of the **SOLID object-oriented design principles**, complete with code examples illustrating both the *violations* (anti-patterns) and the *solutions*.

---

## 📖 Overview of SOLID

| Letter | Principle | Core Definition | Key Benefit |
| :---: | :--- | :--- | :--- |
| **S** | **Single Responsibility (SRP)** | A class should have only one reason to change, meaning only one job/business responsibility. | Easier maintenance, fewer merge conflicts, localized bug fixing. |
| **O** | **Open/Closed (OCP)** | Classes should be open for extension, but closed for modification. | Add new features via new code without breaking existing, tested code. |
| **L** | **Liskov Substitution (LSP)** | Subclasses must be completely substitutable for their base classes without breaking program behavior. | Polymorphism works predictably; no unexpected runtime exceptions from child classes. |
| **I** | **Interface Segregation (ISP)** | Clients should not be forced to depend on methods they do not use. Build small, specific interfaces. | Cleaner contracts, reduced code bloat, avoids empty/dummy method implementations. |
| **D** | **Dependency Inversion (DIP)** | High-level modules should depend on abstractions (interfaces), not concrete low-level implementations. | Loose coupling, making code easily swappable and trivial to unit test with mocks. |

---

## 🗂️ Repository Structure

* `srp/` - Examples separating multi-responsibility classes into focused business units (`Order`, `Payment`, `Notification`).
* `ocp/` - Eliminating hardcoded `if-else` chains using polymorphism and interface extension.
* `lsp/` - Fixing the classic Bird/Penguin hierarchy mismatch with proper capability contracts.
* `isp/` - Breaking down bloated interfaces into role-specific contracts (`Coder`, `Tester`, `Deployer`).
* `dip/` - Decoupling high-level business logic from database layers using constructor injection and interfaces.

---

## 🔑 Key Architectural Concepts Covered

* **Coupling:** How tightly connected two modules are. (We aim for *low coupling* / *decoupled* code using interfaces).
* **Cohesion:** How closely related the responsibilities inside a single class are. (We aim for *high cohesion*).
* **Dependency Injection (DI):** The technique of passing dependencies into a class from the outside (e.g., via constructors) rather than the class creating them internally (`new`), fulfilling the Dependency Inversion Principle (DIP).