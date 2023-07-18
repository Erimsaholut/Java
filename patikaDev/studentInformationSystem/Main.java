package studentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ersin", "Algorithm and Programming", "05873123245");
        Teacher t2 = new Teacher("Mehmet", "Physic", "05873123232");
        Teacher t3 = new Teacher("O.evladı fatih","Yazilim Muhendisligine Giris","05456432343");


        Course algorithm = new Course("Algorithm and Programming", "1001", "ALG");
        algorithm.addTeacher(t1);
        //algorithm.printTeacherInfo();

        Course physic = new Course("Physic", "102", "PHY");
        physic.addTeacher(t2);
        //physic.printTeacherInfo();

        Course ymg = new Course("Yazilim Muhendisligine Giris", "101", "Ymg");
        ymg.addTeacher(t3);
        //ymg.printTeacherInfo();

        Student s1 = new Student("Erim",538,"3",algorithm,physic,ymg);
        s1.addBulkExamNote(99,98,100);
        s1.printNote();
        s1.isPassed();

    }
}
