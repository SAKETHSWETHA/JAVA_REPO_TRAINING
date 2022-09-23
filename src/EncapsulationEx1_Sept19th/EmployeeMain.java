package EncapsulationEx1_Sept19th;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Jos",64);
        System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getRetirementAge());

    }
}
