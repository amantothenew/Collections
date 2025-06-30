// Q2) Given the class Employee { Double Age; Double Salary; String Name }
// Design the class to sort by firstName and lastName by default.
// Also sort by salary using Comparator.

class Employee implements Comparable<Employee> {
    Double age;
    Double salary;
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName, Double age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return firstName + " " + lastName + " | Age: " + age + " | Salary: " + salary;
    }

    @Override
    public int compareTo(Employee e) {
        int compare1 = this.firstName.compareTo(e.firstName);
        if (compare1 == 0) {
            return this.lastName.compareTo(e.lastName);
        } else {
            return compare1;
        }
    }
}

import java.util.*;

class sortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary.compareTo(o2.salary);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Akash", "Kumar", 23.0, 50000.0));
        list.add(new Employee("Aman", "Pal", 23.0, 55000.0));
        list.add(new Employee("Sahil", "Singh", 23.0, 60000.0));
        list.add(new Employee("Manish", "Yadav", 23.0, 40000.0));

        Collections.sort(list);
        System.out.println("Sorted by name \n");
        for(Employee emp : list){
            System.out.println(emp);
        }

        Collections.sort(list, new sortBySalary());
        System.out.println("Sorted By Salary");
        for(Employee emp : list) {
            System.out.println(emp);
        }
    }
}
