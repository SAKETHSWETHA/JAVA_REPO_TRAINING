package EncapsulationEx2_Sept19th;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRegNo(1234);
        s.setAge(5);
        s.setName("Saketh");
        s.setGrade(1);

        System.out.println(s.getAge() + " " + s.getGrade() + " " + s.getName() + " " + s.getRegNo());

    }
}
