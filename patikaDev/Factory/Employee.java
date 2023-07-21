package Factory;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;

        } else {
            return 0.0;
        }
    }

    double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        double workYear = 2023 - hireYear;
        if (workYear < 10) {
            return salary * 0.05;
        } else if (workYear < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    void showStats() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Weekly work hours :" + this.workHours);
        System.out.println("Starting Date : " + this.hireYear);
        System.out.println("Taxes : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Salary increase : " + raiseSalary());
        System.out.println("Salary with Tax and Bonuses : " + (this.salary-tax()+bonus()));
        System.out.println("Total Salary : " + (this.salary-tax()+bonus()+raiseSalary()));
    }


}
