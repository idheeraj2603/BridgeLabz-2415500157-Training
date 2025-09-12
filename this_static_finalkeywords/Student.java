class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Kiran", "A");
        Student s2 = new Student(102, "Meena", "B");
        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
        s2.updateGrade("A+");
        s2.displayDetails();
    }
}
