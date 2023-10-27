public class Main {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.info();
        p.setNumber(79988876655L);
        p.setModel("Iphone 14 pro");
        p.setWeight(364);
        p.receiveCall("Антоха");
        p.info();

        Phone p2 = new Phone("LG 521");
        p2.info();





    }
}