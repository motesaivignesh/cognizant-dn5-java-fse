public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student s = new Student("Sai");
        s.display();
    }
}