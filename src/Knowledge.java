public class Knowledge {

    public double getKnowledgeOf(University university) {
        double level = 0;
        int sum = 0;
        for(int i = 0; i < university.universityStudList.size(); i++){
            sum += university.universityStudList.get(i).getKnowledge();
        }
        try {
            level = sum / university.universityStudList.size();
        } catch (java.lang.ArithmeticException e){
            System.err.println("There is no students in university");
        }
        return level;
    }
}
