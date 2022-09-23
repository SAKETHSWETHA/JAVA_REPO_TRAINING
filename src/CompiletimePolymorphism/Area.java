package CompiletimePolymorphism;

public class Area {
    int area(int l) {
        return l * l;
    }

    double area(double l) {
        return 3.14 * l * l;
    }

    int area(int l, int b) {
        return l * b;
    }

    int area(int l, int b, int h) {
        return l * b * h;
    }
}
