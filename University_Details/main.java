class UniversityMember {
    String fullName;
    int age;
    String gender;

    UniversityMember(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    void printDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends UniversityMember {
    String program;
    int semester;
    double cgpa;

    Student(String fullName, int age, String gender, String program, int semester, double cgpa) {
        super(fullName, age, gender);
        this.program = program;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    void printStudentDetails() {
        System.out.println("----- Student Record -----");
        super.printDetails();
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}

class Teacher extends UniversityMember {
    String department;
    String designation;
    double salary;

    Teacher(String fullName, int age, String gender, String department, String designation, double salary) {
        super(fullName, age, gender);
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    void printTeacherDetails() {
        System.out.println("----- Teacher Record -----");
        super.printDetails();
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Hassan", 19, "Male", "BSCS", 1, 3.45);
        s1.printStudentDetails();

        System.out.println();

        Teacher t1 = new Teacher("Fatima Noor", 29, "Female", "Computer Science", "Lecturer", 150000);
        t1.printTeacherDetails();
    }
}
