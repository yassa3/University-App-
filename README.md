# University Database Management System

## Introduction

The University Database Management System is a comprehensive solution designed to streamline and optimize the management of student, doctor, course, department, and grade-related data within the university environment. It encompasses various components such as database design, SQL and PLSQL implementation, automation scripting, and Java application development to ensure efficient data handling and reporting capabilities.

## Objectives and Goals

- **Design and implement** a robust relational database schema to store and manage student, doctor, course, department, grades, and GPA history information securely.
- **Develop SQL and PLSQL scripts** to facilitate data manipulation tasks and perform complex calculations such as GPA computation.
- **Implement automation scripts** to automate routine tasks like database backup, disk space monitoring, and anomaly detection for system reliability.
- **Create a Java application** following OOP principles to interact with the database, enabling CRUD operations and seamless integration.
- **Generate comprehensive reports** within the Java application to provide valuable insights into courses, enrolled students, and average GPA per course.

## Technologies and Methodologies Used

- **SQL** for database schema creation and normalization to maintain data integrity.
- **SQL and PLSQL** for data querying, manipulation, and procedural tasks.
- **Bash scripts** for automating critical system maintenance tasks.
- **Java SE and OOP principles** for building a robust application with efficient data handling capabilities.
- **Seamless integration** between the Java application and the SQL database to ensure smooth data flow and reporting.
- **Software engineering best practices** including documentation, testing, and version control for project quality and maintainability.

## Database Design

### Relational Database Schema

The relational database schema comprises tables representing students, doctors, courses, departments, grades, and GPA history. Each table is designed to store specific information related to its corresponding entity, and relationships between tables are established using foreign key constraints.

### Entity-Relationship Diagram

An ERD is used to map real-world entities and relationships into a structured database schema, identifying entities, their attributes, and the relationships between them.

### Overview of Tables

- **Students**: `Student_ID`, `FName`, `LName`, `Email`, `DoB`, `Gender`, `Semester`, `GPA`, `City`, `Street`, `Dept_ID (FK)`
- **Student_Phone**: `Student_ID (FK)`, `Phone`
- **Departments**: `Dept_ID`, `Dept_Name`, `Dept_Code`
- **Courses**: `Course_ID`, `Course_Name`, `Hours`, `Course_Code`, `Semester`, `Dept_ID (FK)`
- **Doctors**: `Doctor_ID`, `FName`, `LName`, `Email`, `Dept_ID (FK)`
- **Teach**: `Doctor_ID (FK)`, `Course_ID (FK)`
- **Grades**: `Grade`, `Grade Points`
- **Has**: `Student_ID (FK)`, `Course_ID (FK)`, `Grade (FK)`, `Date`
- **GPA_History**: `Student_ID (FK)`, `Semester`, `GPA`, `Date`

## SQL/PLSQL Implementation

### SQL Scripts

- **Creation Script**: Creates all tables including Students, Doctors, Courses, Departments, Teach, Has, Grades, GPA_History.
- **Test Data Script**: Inserts sample data into the database.

### PLSQL Scripts

- **Sequences**: Creates sequences for Students, Doctors, Courses, Departments tables.
- **Functions**: Includes functions like `Get_IDs`, `calc_course_avg_gpa`, and `calc_gpa`.
- **Procedures**: Includes procedures like `insert_student_info`, `insert_doctor_info`, `insert_course_info`, and `insert_department_info`.
- **Triggers**: Includes `insert_gpa_history`.

## Automation Bash Scripts

- **Database Backup Bash Script**: Automates database backup using the `expdp` utility.
- **Disk Space Monitoring Bash Script**: Monitors disk space usage and logs warnings if usage exceeds a threshold.
- **System Anomaly Detection Bash Script**: Detects anomalies in CPU usage, RAM usage, and disk space availability.

## Java Application Development

### Server Part

- **GUI**: Simple interface with start and stop buttons for the server.
- **Main Thread Class**: Listens for connections from clients and handles data exchange.
- **DTO and DAO Classes**: DTO classes carry data; DAO classes handle database interactions.

### Client Part

- **GUI**: FXML files with Java base classes for different scenes (Login, Students, Doctors, Courses, Departments).
- **Controllers**: Handle user interactions and communicate with the server to perform CRUD operations.

## How to Run

1. **Database Setup**: Run the SQL scripts to create the database schema and insert test data.
2. **Server**: Start the Java server application.
3. **Client**: Run the Java client application to interact with the database.



