import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 2500, 1);
        Worker worker2 = new Worker("Pawel", 2700, 2);
        Worker worker3 = new Worker("Piotr", 2900, 3);
        Worker worker4 = new Worker("Anna", 2100, 4);

        Manager manager = new Manager("Michal", 5500, 5);

        System.out.println("Salary of worker1: " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary of worker2: " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary of worker3: " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary of worker4: " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary of manager: " + manager.getSalary());
        manager.work();
    }
}