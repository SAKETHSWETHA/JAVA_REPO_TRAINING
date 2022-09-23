package RuntimePolymorphism_Sept20th;

public class IPL_Main {
    public static void main(String[] args) {

        IPL ipl1 = new IPL();
        CSK ipl2 = new CSK();
        RCB ipl3 = new RCB();
        ipl1.team="RR";
        ipl1.tournamentWonBy();
        ipl2.tournamentWonBy();
        ipl3.tournamentWonBy();
    }
}
