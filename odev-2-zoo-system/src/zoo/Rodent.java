package zoo;

public class Rodent extends Animal {

    @Override
    public double getDosage() {
        return getWeight() * 0.02;
    }

    @Override
    public String getFeedSchedule() {
        return "Kemirgenler günde 4 kez beslenir.";
    }
}