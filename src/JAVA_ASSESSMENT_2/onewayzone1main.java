package JAVA_ASSESSMENT_2;

public class onewayzone1main {
    public static void main(String[] args) {
        One_WayZone1 one_wayZone1 = new One_WayZone1();

        one_wayZone1.setSource1("Asterisk");
        one_wayZone1.setDestination1("Aldgate");
        one_wayZone1.setCharge1(2.50);


        System.out.println("Michael has clam card who travels from "+one_wayZone1.getSource1()+" to "+one_wayZone1.getDestination1()+
                "with a charge of "+" dollars for his first journey");

    }
}
