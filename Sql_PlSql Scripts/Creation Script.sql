Create Table Students(
Student_ID number(4) ,
Fname varchar2(20) not null,
Lname varchar2(20)not null,
Email varchar2(50) not null unique,
DoB Date,
Gender varchar2(6),
City varchar2 (20),
Street varchar2(20),
Semester varchar2(20),
GPA number(4,2),
Department_ID number(3),
primary key(Student_ID),
foreign key (Department_ID) references Departments(Department_ID)
);

create table Student_Phones(
Student_ID number(4),
Phone varchar2(11),
constraint phone_prim_key primary key(Student_ID,Phone),
foreign key (Student_ID) references Students(Student_ID)
);

Create Table Departments(
Department_ID number(2),
Department_name varchar2(50),
Department_code varchar2(5) not null unique,
primary key (Department_ID)
);

Create Table Courses(
Course_ID number(3),
Course_name varchar2(50),
Course_code varchar2(10) not null unique,
Hours number(1),
Semester varchar2(20),
Department_ID number(2),
primary key (Course_ID),
foreign key (Department_ID) references Departments(Department_ID)
);

Create table Doctors(
Doctor_ID number(3),
Fname varchar2(20) not null,
Lname varchar2(20)not null,
Email varchar2(50) not null unique,
Department_ID number(3),
primary key(Doctor_ID),
foreign key (Department_ID) references Departments(Department_ID)
);

Create table Teach(
Doctor_ID number(3),
Course_ID number(3),
constraint teach_prim_key primary key(Doctor_ID,Course_ID),
foreign key (Doctor_ID) references Doctors(Doctor_ID),
foreign key (Course_ID) references Courses(Course_ID)
);

Create Table Grades(
Grade varchar2(2),
Grade_Points number(3,1) not null,
primary key(Grade)
);

Create Table Has(
Student_ID number(4) ,
Course_ID number(3),
Grade varchar2(2),
Datee Date,
constraint has_prim_key primary key(Student_ID,Course_ID),
foreign key (Student_ID) references Students(Student_ID),
foreign key (Course_ID) references Courses(Course_ID),
foreign key (Grade) references Grades(Grade)
);

Create Table GPA_History(
Student_ID number(4),
Semester varchar2(20),
GPA number(4,2),
Datee Date,
constraint gpa_his_prim_key primary key(Student_ID,Semester),
foreign key (Student_ID) references Students(Student_ID)
);