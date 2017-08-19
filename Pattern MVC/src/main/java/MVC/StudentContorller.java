package MVC;

public class StudentContorller {

    private Student model;
    private StudentView view;

    public StudentContorller(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public void updateView() {
        view.printStudentDetals(model.getName(), model.getRollNo());
    }
}
