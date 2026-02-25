class Student_Q4 {
    int id;
    String name;

    Student_Q4() {
        id = 32;
        name = "Ishan Kishan";
        System.out.println("Default Const..");
    }

    Student_Q4(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized Const....");
    }

    void display() {
        System.out.println("ID: " + id +  "     Name: " + name);
    }

    public static void main(String[] args) {
        Student_Q4 s1 = new Student_Q4();
        s1.display();


        Student_Q4 s2 = new Student_Q4(101, "Rahul");
        s2.display();
    }
}