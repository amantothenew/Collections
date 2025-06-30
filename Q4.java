// Q4) Create class Employee with attributes name, age, designation and use
// instances of this class as keys in a Map and their salary as value.

import java.util.*;

class Employee {
    String name;
    int age;
    String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    public String toString() {
        return name + " (" + age + ", " + designation + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Map<Employee, Double> map = new HashMap<>();

        Employee e1 = new Employee("Aman", 23, "Developer");
        Employee e2 = new Employee("Akash", 23, "Manager");
        Employee e3 = new Employee("Sahil", 23, "Tester");

        map.put(e1, 60000.0);
        map.put(e2, 80000.0);
        map.put(e3, 50000.0);

        for (Map.Entry<Employee, Double> entry : map.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + " | Salary: " + entry.getValue());
        }
    }
}
