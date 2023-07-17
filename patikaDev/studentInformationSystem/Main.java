package studentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ersin", "Algorithm and Programming", "05873123245");
        Teacher t2= new Teacher("Mehmet", "Physic", "05873123232");


        Course algorithm = new Course("Algorithm and Programming", "1001", "ALG", t1);
        Course physic = new Course("Physic", "102", "PHY", t2);

        algorithm.addTeacher(t1);
        algorithm.printTeacherInfo();

        //Student s1 = new Student("Erim",538,);

    }
}
