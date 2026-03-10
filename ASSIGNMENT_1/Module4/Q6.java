package Module4;

class Student {
    static String college = "ABC College";
    String name;

    Student(String name) {
        this.name = name;
    }

    static void changeCollege() {
        college = "XYZ College";
    }

    void display() {
        System.out.println(name + " " + college);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Amit");

        s1.display();
        s2.display();

        Student.changeCollege();

        s1.display();
        s2.display();
    }
}
