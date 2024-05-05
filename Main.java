import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 2500, 1, "2020-03-04", "Junior Developer");
        Worker worker2 = new Worker("Pawel", 2700, 2, "2022-02-18", "Senior Developer");
        Worker worker3 = new Worker("Piotr", 2900, 3, "2019-07-10", "Tester");
        Worker worker4 = new Worker("Anna", 2100, 4, "2019-03-22", "Project Manager");
        Worker worker5 = new Worker("Tomasz", 2300, 3, "2019-03-27", "Project Manager"); 
        Manager manager1 = new Manager("Michal", 5500, 5, "2018-11-27", "Department Head");
        Manager manager2 = new Manager("Maria", 5800, 1, "2017-02-01", "CTO"); 

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        
        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
            
            if (idMap.containsKey(emp.getId())) {
                idMap.get(emp.getId()).add(emp);
            } else {
                List<Employee> empList = new ArrayList<>();
                empList.add(emp);
                idMap.put(emp.getId(), empList);
            }
        }

        
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);

        
        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            List<Employee> empList = entry.getValue();
            if (empList.size() > 1) {
                System.out.println("Employees with same ID: ");
                for (Employee emp : empList) {
                    System.out.println("- " + emp.getName());
                }
            }
        }
    }
}