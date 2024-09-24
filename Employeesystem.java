import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    String position;
    double salary;

    public Employee(int id, String name, String department, String position, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Position: " + position + ", Salary: " + salary;
    }
}

class Attendance {
    int employeeId;
    Date date;
    boolean present;

    public Attendance(int employeeId, Date date, boolean present) {
        this.employeeId = employeeId;
        this.date = date;
        this.present = present;
    }

    public String toString() {
        return "Employee ID: " + employeeId + ", Date: " + date + ", Present: " + present;
    }
}

class Performance {
    int employeeId;
    String review;
    int rating;

    public Performance(int employeeId, String review, int rating) {
        this.employeeId = employeeId;
        this.review = review;
        this.rating = rating;
    }

    public String toString() {
        return "Employee ID: " + employeeId + ", Review: " + review + ", Rating: " + rating;
    }
}

class Employeesystem {
    List<Employee> employees = new ArrayList<>();
    List<Attendance> attendanceRecords = new ArrayList<>();
    List<Performance> performanceRecords = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }

    public void removeEmployee(int id) {
        employees.removeIf(e -> e.id == id);
        System.out.println("Employee with ID " + id + " removed.");
    }

    public void viewEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void recordAttendance(int employeeId, boolean present) {
        Attendance attendance = new Attendance(employeeId, new Date(), present);
        attendanceRecords.add(attendance);
        System.out.println("Attendance recorded: " + attendance);
    }

    public void viewAttendance() {
        System.out.println("Attendance Records:");
        for (Attendance attendance : attendanceRecords) {
            System.out.println(attendance);
        }
    }

    public void addPerformanceReview(int employeeId, String review, int rating) {
        Performance performance = new Performance(employeeId, review, rating);
        performanceRecords.add(performance);
        System.out.println("Performance review added: " + performance);
    }

    public void viewPerformanceReviews() {
        System.out.println("Performance Reviews:");
        for (Performance performance : performanceRecords) {
            System.out.println(performance);
        }
    }

    public static void main(String[] args) {
        Employeesystem system = new Employeesystem();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. View Employees");
            System.out.println("4. Record Attendance");
            System.out.println("5. View Attendance");
            System.out.println("6. Add Performance Review");
            System.out.println("7. View Performance Reviews");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    System.out.print("Enter Position: ");
                    String position = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    system.addEmployee(new Employee(id, name, department, position, salary));
                    break;
                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();
                    system.removeEmployee(removeId);
                    break;
                case 3:
                    system.viewEmployees();
                    break;
                case 4:
                    System.out.print("Enter Employee ID for attendance: ");
                    int attendanceId = sc.nextInt();
                    System.out.print("Is the employee present? (true/false): ");
                    boolean present = sc.nextBoolean();
                    system.recordAttendance(attendanceId, present);
                    break;
                case 5:
                    system.viewAttendance();
                    break;
                case 6:
                    System.out.print("Enter Employee ID for review: ");
                    int reviewId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter performance review: ");
                    String review = sc.nextLine();
                    System.out.print("Enter rating (1-5): ");
                    int rating = sc.nextInt();
                    system.addPerformanceReview(reviewId, review, rating);
                    break;
                case 7:
                    system.viewPerformanceReviews();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
