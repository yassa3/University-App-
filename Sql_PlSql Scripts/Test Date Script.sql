-- Insert data into Departments table
INSERT INTO Departments (Department_ID, Department_name, Department_code)
VALUES (1, 'Gryffindor House', 'GRY');

INSERT INTO Departments (Department_ID, Department_name, Department_code)
VALUES (2, 'Slytherin House', 'SLY');

INSERT INTO Departments (Department_ID, Department_name, Department_code)
VALUES (3, 'Department of Potions and Alchemy', 'POT');
-- Insert data into Students table
INSERT INTO Students (Student_ID, Fname, Lname, Email, DoB, Gender, City, Street, Semester, GPA, Department_ID)
VALUES
(1, 'Harry', 'Potter', 'harry@hogwarts.com', TO_DATE('1980-07-31', 'YYYY-MM-DD'), 'Male', 'Hogsmeade', '12 Grimmauld Place', 'Spring 2024', 3.8, 1);

INSERT INTO Students (Student_ID, Fname, Lname, Email, DoB, Gender, City, Street, Semester, GPA, Department_ID)
VALUES
(2, 'Hermione', 'Granger', 'hermione@hogwarts.com', TO_DATE('1979-09-19', 'YYYY-MM-DD'), 'Female', 'London', '10 Downing Street', 'Spring 2024', 4.0, 3);

INSERT INTO Students (Student_ID, Fname, Lname, Email, DoB, Gender, City, Street, Semester, GPA, Department_ID)
VALUES
(3, 'Ron', 'Weasley', 'ron@hogwarts.com', TO_DATE('1980-03-01', 'YYYY-MM-DD'), 'Male', 'Ottery St. Catchpole', 'The Burrow', 'Spring 2024', 3.6, 1);

-- Insert data into Student_Phones table
INSERT INTO Student_Phones (Student_ID, Phone)
VALUES
(1, '01210195934');

INSERT INTO Student_Phones (Student_ID, Phone)
VALUES
(2, '01289941675');

INSERT INTO Student_Phones (Student_ID, Phone)
VALUES
(3, '12345678912');

-- Insert data into Courses table
INSERT INTO Courses (Course_ID, Course_name, Course_code, Hours, Semester, Department_ID)
VALUES
(1, 'Defense Against the Dark Arts', 'DADA101', 3, 'Spring 2024', 1);

INSERT INTO Courses (Course_ID, Course_name, Course_code, Hours, Semester, Department_ID)
VALUES
(2, 'Transfiguration', 'TRANS102', 3, 'Spring 2024', 1);

INSERT INTO Courses (Course_ID, Course_name, Course_code, Hours, Semester, Department_ID)
VALUES
(3, 'Potions 101', 'POT101', 3, 'Spring 2024', 3);

-- Insert data into Doctors table
INSERT INTO Doctors (Doctor_ID, Fname, Lname, Email, Department_ID)
VALUES
(1, 'Severus', 'Snape', 'snape@hogwarts.com', 3);

INSERT INTO Doctors (Doctor_ID, Fname, Lname, Email, Department_ID)
VALUES
(2, 'Minerva', 'McGonagall', 'mcgonagall@hogwarts.com', 1);

INSERT INTO Doctors (Doctor_ID, Fname, Lname, Email, Department_ID)
VALUES
(3, 'Rubeus', 'Hagrid', 'hagrid@hogwarts.com', 2);

-- Insert data into Teach table
INSERT INTO Teach (Doctor_ID, Course_ID)
VALUES
(1, 103);

INSERT INTO Teach (Doctor_ID, Course_ID)
VALUES
(2, 101);

INSERT INTO Teach (Doctor_ID, Course_ID)
VALUES
(3, 102);

INSERT INTO Grades (Grade, Grade_Points) VALUES ('A', 4.0);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('A-', 3.7);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('B+', 3.3);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('B', 3.0);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('B-', 2.7);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('C+', 2.3);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('C', 2.0);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('C-', 1.7);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('D+', 1.3);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('D', 1.0);
INSERT INTO Grades (Grade, Grade_Points) VALUES ('F', 0.0);

-- Insert data into Has table
INSERT INTO Has (Student_ID, Course_ID, Grade, Datee)
VALUES
(1, 101, 'A', SYSDATE);

INSERT INTO Has (Student_ID, Course_ID, Grade, Datee)
VALUES
(2, 102, 'A', SYSDATE);

INSERT INTO Has (Student_ID, Course_ID, Grade, Datee)
VALUES
(3, 103, 'B', SYSDATE);

-- Insert data into GPA_History table
INSERT INTO GPA_History (Student_ID, Semester, GPA, Datee)
VALUES
(1, 'Spring 2023', 3.8, SYSDATE);

INSERT INTO GPA_History (Student_ID, Semester, GPA, Datee)
VALUES
(2, 'Spring 2023', 4.0, SYSDATE);

INSERT INTO GPA_History (Student_ID, Semester, GPA, Datee)
VALUES
(3, 'Spring 2023', 3.6, SYSDATE);
