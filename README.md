
# 📋 Task Management System

A robust, console-based Task Management application built with Java, demonstrating core Object-Oriented Programming (OOP) principles, clean architecture, and modern date handling.

---

## ✨ Features

- **Multi-Category Task Support:** Create specialized tasks (`SchoolTask`, `WorkTask`, `HomeTask`, `GeneralTask`) using inheritance and polymorphism.
- **Dynamic Task Management:** Add, edit, delete, and view tasks with auto-generated unique IDs.
- **Filtering & Tracking:** Filter tasks by status (`TODO`, `IN_PROGRESS`, `DONE`) and monitor priorities (`LOW`, `MEDIUM`, `HIGH`).
- **Deadline Handling:** Accurate date management utilizing Java's `LocalDate` API.
- **User-Centric Console UI:** Interactive CLI with preview capabilities to view tasks before updating or deleting.

---

## 🛠️ OOP Architecture & Concepts

- **Inheritance & Polymorphism:** Base `Task` class extended by specialized subclasses to handle distinct attributes (e.g., `courseName`, `projectName`, `department`).
- **Encapsulation:** Private field definitions paired with standard getter and setter accessors.
- **Enums:** Type-safe enumeration models for `Status` and `Priority`.
- **Collection Management:** Dynamic memory storage using `ArrayList<Task>` managed under a dedicated service class (`TaskManagement`).

---

## 📂 Project Structure

```text
src/
└── taskmanagementapp/
    ├── Task.java             # Base task model
    ├── SchoolTask.java       # School-specific task subclass
    ├── WorkTask.java         # Work-specific task subclass
    ├── HomeTask.java         # Home-specific task subclass
    ├── GeneralTask.java      # Generic task subclass
    ├── Status.java           # Enum (TODO, IN_PROGRESS, DONE)
    ├── Priority.java         # Enum (LOW, MEDIUM, HIGH)
    ├── TaskManagement.java   # Business logic & collection manager
    └── Main.java             # Console UI & application entry point
🚀 Getting Started
Prerequisites
Java Development Kit (JDK 8 or higher)

Any Java IDE (IntelliJ IDEA, NetBeans, Eclipse, VS Code) or Terminal

Run via Terminal
Bash
# Clone the repository
git clone [https://github.com/silacicek0/-TaskManagementApp.git](https://github.com/silacicek0/-TaskManagementApp.git)

# Navigate to project directory
cd -TaskManagementApp/src

# Compile source files
javac taskmanagementapp/*.java

# Run application
java taskmanagementapp.Main
👩‍💻 Author
silacicek0 - GitHub Profile
