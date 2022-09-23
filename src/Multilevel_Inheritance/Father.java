package Multilevel_Inheritance;

public class Father extends GrandFather {
    public void work(){
        System.out.println("Father works in office");
    }
    @Override
    public void swim() {
        System.out.println("Father swims in river");
    }
}
