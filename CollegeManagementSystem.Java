abstract class Person {
    int id;
    String name;
    int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    abstract void showDetails();
    abstract double calculatePayment();
    abstract void displayRole();
}

class Student extends Person {
    String course;
    double fee;

    Student(int id, String name, int age, String course, double fee) {
        super(id, name, age);
        this.course = course;
        this.fee = fee;
    }

    @Override
    double calculatePayment() {
        return fee;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

class Professor extends Person {
    String subject;
    double salary;

    Professor(int id, String name, int age, String subject, double salary) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Professor");
    }

    @Override
    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

class AdminStaff extends Person {
    String department;
    double salary;

    AdminStaff(int id, String name, int age, String department, double salary) {
        super(id, name, age);
        this.department = department;
        this.salary = salary;
    }

    @Override
    double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Admin Staff");
    }

    @Override
    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class CollegeManagementSystem {
    public static void main(String[] args) {

        // Creating two Student objects
        Student s1 = new Student(101, "Rahul", 20, "Java", 25000);
        Student s2 = new Student(102, "Priya", 21, "Python", 30000);

        // Creating two Professor objects
        Professor p1 = new Professor(201, "Mahesh", 40, "Java", 60000);
        Professor p2 = new Professor(202, "Karan", 35, "SQL", 55000);

        // Creating one AdminStaff object
        AdminStaff a1 = new AdminStaff(301, "Ramesh", 32, "Accounts", 35000);

        // Person array - Runtime Polymorphism
        Person[] people = {s1, s2, p1, p2, a1};

        double totalPayment = 0;

        // Display details of all objects
        for (Person person : people) {
            System.out.println("----------------------------");
            person.showDetails();
            person.displayRole();

            double payment = person.calculatePayment();
            System.out.println("Payment: " + payment);

            totalPayment += payment;
        }

        // Display total payment
        System.out.println("----------------------------");
        System.out.printf("Total Payment: %.2f%n", totalPayment);
    }
}