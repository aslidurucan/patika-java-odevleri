package elevator;

public class FloorDoor {
    private int elevatorId;
    private boolean isOpen;

    public FloorDoor(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public void open() {
        isOpen = true;
        System.out.println("Asansör " + elevatorId + " kat kapısı açıldı.");
    }

    public void close() {
        isOpen = false;
        System.out.println("Asansör " + elevatorId + " kat kapısı kapandı.");
    }

    public boolean isOpen() { return isOpen; }
    public int getElevatorId() { return elevatorId; }
}