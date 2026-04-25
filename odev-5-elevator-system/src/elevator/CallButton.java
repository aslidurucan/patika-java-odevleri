package elevator;

public class CallButton {
    private String direction; // "UP" veya "DOWN"
    private boolean isPressed;

    public CallButton(String direction) {
        this.direction = direction;
    }

    public void press() {
        isPressed = true;
        System.out.println(direction + " butonu basıldı.");
    }

    public String getDirection() { return direction; }
    public boolean isPressed() { return isPressed; }
    public void reset() { isPressed = false; }
}