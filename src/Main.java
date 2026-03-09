public class Main {

    public static void main(String[] args) {


        Machine machineA = new Machine("Machine A");
        Machine machineB = new Machine("Machine B");
        Machine machineC = new Machine("Machine C");

        Employee employee1 = new Employee("John", "Technician");
        Employee employee2 = new Employee("Sarah", "Production Manager");
        Employee employee3 = new Employee("Michael", "Maintenance Engineer");

        // Register employee interest in machines
        machineA.attach(employee1);
        machineA.attach(employee2);

        machineB.attach(employee2);
        machineB.attach(employee3);

        machineC.attach(employee1);
        machineC.attach(employee3);

        // Change machine states
        System.out.println("Machine State Updates");
        System.out.println();
        machineA.changeState("PRODUCING");
        System.out.println();

        machineB.changeState("IDLE");
        System.out.println();

        machineC.changeState("STARVED");
        System.out.println();

        machineA.changeState("STARVED");
        System.out.println();

        machineB.changeState("PRODUCING");
    }
}