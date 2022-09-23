package JAVA_ASSESSMENT_2;

public class onewayzone1tozone2_main {
    public static void main(String[] args) {
        One_WayZone1toZone2 one_wayZone1toZone2 = new One_WayZone1toZone2();
        one_wayZone1toZone2.setSource1("Asterisk");
        one_wayZone1toZone2.setDestination2("Barbican");
        one_wayZone1toZone2.setCharge2(3.00);

        System.out.println("Michael has clam card who travels from "+one_wayZone1toZone2.getSource1()+" to "+one_wayZone1toZone2.getDestination2()+
                " with a charge of "+" dollars for his first journey");

    }

}
