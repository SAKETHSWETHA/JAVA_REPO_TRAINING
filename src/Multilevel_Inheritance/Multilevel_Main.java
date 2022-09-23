package Multilevel_Inheritance;

public class Multilevel_Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.swim();
        son.work();
        son.sleep();
        Father father = new Father();
        father.swim();
        father.work();
        father.sleep();

    }
}
