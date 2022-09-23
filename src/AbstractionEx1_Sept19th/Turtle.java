package AbstractionEx1_Sept19th;


//As turtle can swim and it is an animal so we have to use multiple inheritance, But java doesn't obey multiple inheritance. Interface is used in this kind of situation.
//So we created a interface called swimmable and extend into the animal class.


public class Turtle extends Animal implements Swims {

    @Override
    void shout() {
        System.out.println("Beck");
    }


    @Override
    public boolean swims() {
        return true;
    }
}
