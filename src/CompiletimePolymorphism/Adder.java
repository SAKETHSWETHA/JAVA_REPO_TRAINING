package CompiletimePolymorphism;

//Compile time polymorphism which is achieved by method overloading
//Same name but different number of arguments or different datatypes...
public class Adder {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add(float a, float b)
    {
        return a+b;
    }
}

