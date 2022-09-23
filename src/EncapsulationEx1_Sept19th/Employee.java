package EncapsulationEx1_Sept19th;

public class Employee {

    private int id;
    private String name;
    private int retirementAge;

    //Default Constructor
    /*public Employee() {

    }*/

    //Getter and setter to access private variables
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getRetirementAge() {
        return this.retirementAge;
    }


    public void setId(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setRetirementAge(int retirementAge) {
        this.id=id;
    }

    //Parametrized constructor
    public Employee(int id, String name, int retirementAge)
    {
        this.id=id;
        this.name=name;
        this.retirementAge=retirementAge;
    }

}

