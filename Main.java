import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 2500, 1, "2020-03-04", "Junior Developer");
        Worker worker2 = new Worker("Pawel", 2700, 2, "2022-02-18", "Senior Developer");
        Worker worker3 = new Worker("Piotr", 2900, 3, "2019-07-10", "Tester");
        Worker worker4 = new Worker("Anna", 2100, 4, "2019-03-22", "Project Manager");

        Manager manager = new Manager("Michal", 5500, 5, "2018-11-27", "Department Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.getId() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}