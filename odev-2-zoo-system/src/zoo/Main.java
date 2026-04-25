package zoo;

public class Main {
    public static void main(String[] args) {

        Animal at = new Horse();
        at.setName("Zebra");
        at.setWeight(300);

        Animal kaplan = new Feline();
        kaplan.setName("Kaplan");
        kaplan.setWeight(200);

        Animal sican = new Rodent();
        sican.setName("Kunduz");
        sican.setWeight(15);

        System.out.println(at.getName() + " -> " + at.getFeedSchedule());
        System.out.println(kaplan.getName() + " -> " + kaplan.getFeedSchedule());
        System.out.println(sican.getName() + " -> " + sican.getFeedSchedule());

        System.out.println(at.getName() + " ilaç dozu: " + at.getDosage() + " mg");
        System.out.println(kaplan.getName() + " ilaç dozu: " + kaplan.getDosage() + " mg");
        System.out.println(sican.getName() + " ilaç dozu: " + sican.getDosage() + " mg");
    }
}