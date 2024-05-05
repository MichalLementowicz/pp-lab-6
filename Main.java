import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 2500, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Pawel", 2700, 2, "2023-03-15", "Senior Developer");
        Worker worker3 = new Worker("Piotr", 2900, 3, "2020-12-10", "Tester");
        Worker worker4 = new Worker("Anna", 2100, 4, "2021-06-20", "Project Manager");

        Manager manager = new Manager("Michal", 5500, 5, "2019-05-10", "Department Head");

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