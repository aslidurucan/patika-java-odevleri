package elevator;

public class Elevator {
    private int id;
    private int capacity = 6;
    private int currentFloor = 1;
    private ElevatorDoor door;
    private ControlPanel controlPanel;
    private FloorIndicatorLight indicatorLight;

    public Elevator(int id, int totalFloors) {
        this.id = id;
        this.door = new ElevatorDoor();
        this.controlPanel = new ControlPanel(totalFloors);
        this.indicatorLight = new FloorIndicatorLight();
    }

    public void move(int targetFloor) {
        System.out.println("Asansör " + id + " -> " + targetFloor + ". kata hareket ediyor.");
        currentFloor = targetFloor;
        indicatorLight.update(currentFloor);
        door.open();
        door.close();
    }

    public int getId() { return id; }
    public int getCurrentFloor() { return currentFloor; }
    public int getCapacity() { return capacity; }
    public ElevatorDoor getDoor() { return door; }
    public ControlPanel getControlPanel() { return controlPanel; }
}