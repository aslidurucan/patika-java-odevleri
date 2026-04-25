package zoo;

public abstract class Animal {
    private String name;
    private double weight;
    private int age;

    public String getName() { return name; }
    public double getWeight() { return weight; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setAge(int age) { this.age = age; }

    public abstract double getDosage();
    public abstract String getFeedSchedule();
}