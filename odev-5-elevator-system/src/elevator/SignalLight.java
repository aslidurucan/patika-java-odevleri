package elevator;

public class SignalLight {
    private String direction; // "UP", "DOWN" veya "NONE"
    private boolean isOn;

    public void update(String direction) {
        this.direction = direction;
        this.isOn = true;
        System.out.println("Sinyal ışığı: " + direction);
    }

    public void turnOff() {
        isOn = false;
        direction = "NONE";
        System.out.println("Sinyal ışığı söndü.");
    }

    public String getDirection() { return direction; }
    public boolean isOn() { return isOn; }
}