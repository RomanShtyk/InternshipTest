import java.util.ArrayList;

public class University {

    public ArrayList<Student> universityStudList = new ArrayList<>();
    private String name;

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student, double level) {
        student.setKnowledge(level);
    }

    public void addStudent(Student student) {
        student.setAlmaMatter(name);
        universityStudList.add(student);
    }
}