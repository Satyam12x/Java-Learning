//Practice Questions on Inheritance 

/*
1. A base class Student stores name and roll number. A derived class Result stores marks of 3 subjects and calculates the total. What will be the output?
*/

class Student {
    String name = "Ankit";
    int roll = 101;
}

class Result extends Student {
    int m1 = 85, m2 = 90, m3 = 80;

    void displayResult() {
        int total = m1 + m2 + m3;
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.displayResult();
    }
}


/*
Roll: 101  
Name: Ankit  
Total Marks: 255
*/

/*
2. Parent class Employee has basic salary = 40,000. Child class Manager adds bonus = 8,000. Calculate total salary.
*/

class Employee {
    double basic = 40000;
}

class Manager extends Employee {
    double bonus = 8000;

    double totalSalary() {
        return basic + bonus;
    }
}

public class Office {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Total Salary: " + m.totalSalary());
    }
}
