package studentInformationSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.name)) {
            this.teacher = teacher;
        } else {
            System.out.println("Teacher and branchs are not compatible");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }

}

