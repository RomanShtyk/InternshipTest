public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 9));
        university.addStudent(new Student("Julia Veselkina", 10));
        university.addStudent(new Student("Maria Perechrest", 12));

        University u2 = new University("NU LP");
        u2.addStudent(new Student("Andrew", 15));
        u2.addStudent(new Student("Julia ", 30));
        u2.addStudent(new Student("Maria ", 46));


        Internship internship = new Internship("Interlink");
        internship.setStudent(university);
        internship.setStudent(u2);
        System.out.println("List of internship's students:");
        System.out.printf(internship.getStudents());
    }
}
