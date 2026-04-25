package elevator;

public class ArrivalBell {
    private int elevatorId;

    public ArrivalBell(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public void ring() {
        System.out.println("Asansör " + elevatorId + " geldi! Zil çalıyor.");
    }
}