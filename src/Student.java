public class Student {

    private String name;
    private double knowledge;
    private String almaMatter;

    public double getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return name;
    }

    public Student(String name, double knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public void setKnowledge(double knowledge) {
        this.knowledge = knowledge;
    }

    public void setAlmaMatter(String almaMatter) {
        this.almaMatter = almaMatter;
    }
}
