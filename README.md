# 🎓 Student Management System (Java)

> A clean and beginner-friendly Java application that manages student records, calculates average marks, assigns grades, sorts students based on performance, and displays the final results.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Project-Completed-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 📖 Overview

This project demonstrates the core concepts of **Object-Oriented Programming (OOP)** in Java by implementing a simple **Student Management System**.

Each student has:
- Name
- Marks (stored in an array)
- Automatically calculated average
- Grade assigned according to the average

Finally, all students are sorted in **descending order of average marks**, making it easy to identify top performers.

---

## ✨ Features

- 📌 Student class with encapsulated data
- 📌 Store marks using arrays
- 📌 Calculate average marks
- 📌 Automatic grade calculation
- 📌 Display formatted student details
- 📌 Sort students by highest average
- 📌 Uses Java Collections Framework
- 📌 Clean console output
- 📌 Beginner-friendly and well-structured code

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Arrays
- ArrayList
- Comparator
- Collections.sort()

---

## 📂 Project Structure

```
Student-Management-System/
│── StudentManagementSystem.java
│── README.md
│── LICENSE
```

---

## 🏗 Class Design

### Student

| Attribute | Description |
|------------|-------------|
| name | Student's name |
| marks | Array of subject marks |

### Methods

| Method | Description |
|---------|-------------|
| average() | Calculates average marks |
| grade() | Returns A/B/C/D/F |
| display() | Displays student information |

---

## 📊 Grade Criteria

| Average Marks | Grade |
|--------------:|:-----:|
| 90 - 100 | A |
| 80 - 89 | B |
| 70 - 79 | C |
| 60 - 69 | D |
| Below 60 | F |

---

## 💻 Sample Output

```text
=========================================
     STUDENT RESULT MANAGEMENT SYSTEM
=========================================

Rank #1
-----------------------------------------
Student Name : Priya
Marks        : 98 97 99 96 100
Average      : 98.00
Grade        : A

Rank #2
-----------------------------------------
Student Name : Ashwini
Marks        : 95 92 90 96 94
Average      : 93.40
Grade        : A

Rank #3
-----------------------------------------
Student Name : Sneha
Marks        : 88 91 84 89 90
Average      : 88.40
Grade        : B

Rank #4
-----------------------------------------
Student Name : Rahul
Marks        : 80 85 78 82 81
Average      : 81.20
Grade        : B

Rank #5
-----------------------------------------
Student Name : Amit
Marks        : 67 72 70 69 71
Average      : 69.80
Grade        : D

-----------------------------------------
Sorting Completed (Highest Average First)
-----------------------------------------
```

---

## 🚀 How to Run

### Clone the repository

```bash
git clone https://github.com/your-username/Student-Management-System.git
```

### Navigate to the project

```bash
cd Student-Management-System
```

### Compile

```bash
javac StudentManagementSystem.java
```

### Run

```bash
java StudentManagementSystem
```

---

## 📚 Java Concepts Demonstrated

- ✅ Classes & Objects
- ✅ Constructors
- ✅ Encapsulation
- ✅ Arrays
- ✅ Methods
- ✅ Loops
- ✅ Conditional Statements
- ✅ ArrayList
- ✅ Comparator
- ✅ Collections Framework
- ✅ Method Calling
- ✅ Object Creation
- ✅ Sorting Algorithms (via Collections.sort())

---

## 🎯 Learning Outcomes

This project helps in understanding:

- Object-Oriented Programming fundamentals
- Managing collections of objects
- Sorting objects using custom comparators
- Working with arrays and loops
- Building structured Java console applications

---

## 🔮 Future Enhancements

- Add user input using `Scanner`
- Store student data in a file
- Search student by name
- Update student marks
- Delete student records
- Calculate class statistics
- Export results to CSV
- Build a GUI using Java Swing or JavaFX
- Connect with a MySQL database

---

## 🤝 Contributing

Contributions are welcome!

1. Fork this repository.
2. Create a new feature branch.
3. Commit your changes.
4. Push to your branch.
5. Open a Pull Request.

---

## ⭐ Support

If you found this project helpful:

- ⭐ Star this repository
- 🍴 Fork it
- 💡 Share your feedback

---

## 👩‍💻 Author

**Ashwini Sabale**

Software Engineering Student | Java Developer | Data Analytics Enthusiast

GitHub: https://github.com/ashwini-s2004

---

## 📄 License

This project is licensed under the **MIT License**.

---

> **"Practice makes progress. Every project is a step toward becoming a better developer."** 🚀
