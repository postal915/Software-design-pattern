package MVC;

public class MVCExample {
    public static void main(String[] args) {

        Student model = retiveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentContorller contorller = new StudentContorller(model, view);

        contorller.updateView();

        contorller.setStudentName("John");

        contorller.updateView();
    }

    private static Student retiveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
