public class Application {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("Week 3 Course Project");
        System.out.println("Logan Clay");
        System.out.println("Abstraction, Constructors, and Access Specifiers");
        System.out.println("================================");

        System.out.println("\nWelcome to the application.");
        System.out.println("The system demonstrates object-oriented programming concepts.\n");

        Student student =
            new Student(1001,
                        "Logan Clay",
                        "Software Development");

        Instructor instructor =
            new Instructor(5001,
                           "Dr. Smith",
                           "Computer Science");

        student.displayRole();
        System.out.println(student);

        System.out.println();

        instructor.displayRole();
        System.out.println(instructor);
    }
}

class Instructor {
    private final int id;
    private final String name;
    private final String department;

    public Instructor(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Instructor");
    }

    @Override
    public String toString() {
        return "Instructor{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
}

class Student {
    private final int id;
    private final String name;
    private final String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', program='" + program + "'}";
    }
}
