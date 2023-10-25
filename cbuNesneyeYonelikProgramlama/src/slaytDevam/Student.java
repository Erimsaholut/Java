package slaytDevam;

public class Student {
    public int number;
    public String mail;
    public String name;
    public String surname;

    Student(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.mail = name + surname + "@" + number + ".com";
    }

    public void fireTheStudent() {
        System.out.println(this.name + " is Fired.");
    }

    public void appreciate() {
        System.out.println(this.name + ", keep doing what you're doing right now. Actually who cares ?");
    }

    public int assesTheExam() {
        return (int) (Math.random() * 100);
    }

    public void printExamResult(int examResult) {
        System.out.println(this.name + " " + this.surname + "'s exam result is " + examResult);
    }

}
