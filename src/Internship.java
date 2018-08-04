import java.util.ArrayList;

public class Internship {

    private String name;
    private ArrayList<Student> listOfInterns = new ArrayList<>();
    private String outputListOfInterns = "Accepted interns: ";

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(University university) {
        Knowledge rating = new Knowledge();
        double level = rating.getKnowledgeOf(university);
        for(int i = 0; i < university.universityStudList.size(); i++){
            if(university.universityStudList.get(i).getKnowledge() > level){
                listOfInterns.add(university.universityStudList.get(i));
            }
        }
    }

    public String getStudents() {
        String list = "";
        for(int i = 0; i < listOfInterns.size(); i++){
           list += "\n " + listOfInterns.get(i).getName();
        }
        this.outputListOfInterns += list;
        return outputListOfInterns;
    }
}
