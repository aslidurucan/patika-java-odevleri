package zoo;

public class Feline extends Animal {

    @Override
    public double getDosage() {
        return getWeight() * 0.08;
    }

    @Override
    public String getFeedSchedule() {
        return "Kedigiller günde 2 kez beslenir: sabah ve akşam.";
    }
}