package elevator;

public class ElevatorDoor {
    private boolean isOpen;

    public boolean isOpen() { return isOpen; }

    public void open() {
        isOpen = true;
        System.out.println("Asansör kapısı açıldı.");
    }

    public void close() {
        isOpen = false;
        System.out.println("Asansör kapısı kapandı.");
    }
}