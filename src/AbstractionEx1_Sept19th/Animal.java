package AbstractionEx1_Sept19th;

public abstract class Animal {
    String name;
    String food;

    //Define a method or make it abstract(abstract class) and over-ride it in another class which inherits abstract class.
    //Make a method in the super class abstract when it is a mandatory for all the child classes to inherit that particular method from super class.
    //Every animal shouts so we are making it as an abstract class which is default and it can be used in different ways as each animal shouts differently by over-riding this method in parent class...
    abstract void shout();

}
