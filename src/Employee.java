public class Employee extends Observer {

    private String role;

    public Employee(String name, String role) {
        super(name);
        this.role = role;
    }

    @Override
    public void update(String state, String from) {
        System.out.println("Employee Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Machine: " + from);
        System.out.println("Updated State: " + state);
    }
}