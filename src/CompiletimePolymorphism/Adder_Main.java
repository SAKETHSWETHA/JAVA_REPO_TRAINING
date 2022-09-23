package CompiletimePolymorphism;

public class Adder_Main {

        public static void main(String[] args) {
            Adder a = new Adder();
            System.out.println(a.add(6,10));
            System.out.println(a.add(9.2f,6.5f));
            System.out.println(a.add(1,2,3));
        }
    }

