Add Employee: Add a new employee by specifying their ID, name, department, position, and salary.
Remove Employee: Remove an employee by their ID.
View Employees: Display the list of all employees.
Record Attendance: Record whether an employee was present or absent on a particular day.
View Attendance: View all attendance records for employees.
Add Performance Review: Add a performance review for an employee, including a review text and rating (1-5 scale).
View Performance Reviews: Display all performance reviews for employees.
Exit: Exit the system.
Classes
1. Employee
Represents an employee with the following attributes:
int id: Employee ID.
String name: Employee name.
String department: Employee's department.
String position: Employee's job title.
double salary: Employee's salary.
The toString() method provides a formatted string with the employee's details.

2. Attendance
Represents an attendance record with the following attributes:
int employeeId: Employee ID for whom the attendance is recorded.
Date date: The date when the attendance is recorded (automatically set to the current date).
boolean present: Indicates whether the employee was present or not.
The toString() method provides a formatted string with the attendance details.

3. Performance
Represents a performance review with the following attributes:
int employeeId: Employee ID for whom the performance review is written.
String review: The textual performance review.
int rating: A rating on a scale of 1 to 5.
The toString() method provides a formatted string with the performance review details.

4. Employeesystem
This is the main class that manages the employees, attendance, and performance reviews. It contains the following lists:
List<Employee> employees: A list of all employees.
List<Attendance> attendanceRecords: A list of all attendance records.
List<Performance> performanceRecords: A list of all performance reviews.
The class provides methods to:
Add and remove employees.
Record attendance.
Add performance reviews.
View all employees, attendance records, and performance reviews.

Methods:
addEmployee(Employee employee): Adds an employee to the system.
removeEmployee(int id): Removes an employee by their ID.
viewEmployees(): Prints the list of all employees.
recordAttendance(int employeeId, boolean present): Records attendance for an employee.
viewAttendance(): Displays all attendance records.
addPerformanceReview(int employeeId, String review, int rating): Adds a performance review for an employee.
viewPerformanceReviews(): Displays all performance reviews.
Usage
Compile the Java code using javac Employeesystem.java.
Run the system using java Employeesystem.
The system will present a menu with options to add, remove, view employees, record attendance, and manage performance reviews.
