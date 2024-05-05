import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 2500, 1, "2020-03-04", "Junior Developer");
        Worker worker2 = new Worker("Pawel", 2700, 2, "2022-02-18", "Senior Developer");
        Worker worker3 = new Worker("Piotr", 2900, 1, "2019-07-10", "Tester");
        Manager manager = new Manager("Michal", 5500, 5, "2018-11-27", "Department Head");



        
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

     
        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
    }
}