package elevator;

public class FloorIndicatorLight {
    private int currentFloor;

    public int getCurrentFloor() { return currentFloor; }

    public void update(int floor) {
        currentFloor = floor;
        System.out.println("Gösterge ışığı güncellendi: " + floor + ". kat");
    }
}