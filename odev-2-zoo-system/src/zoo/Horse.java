package zoo;

public class Horse extends Animal {

    @Override
    public double getDosage() {
        return getWeight() * 0.05;
    }

    @Override
    public String getFeedSchedule() {
        return "Atlar günde 3 kez beslenir: sabah, öğle, akşam.";
    }
}