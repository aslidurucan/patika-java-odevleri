package elevator;

public class ControlPanel {
    private int[] destinationButtons;
    private boolean doorOpenButton;
    private boolean doorCloseButton;
    private boolean emergencyButton;

    public ControlPanel(int totalFloors) {
        destinationButtons = new int[totalFloors];
    }

    public void pressDestination(int floor) {
        destinationButtons[floor - 1] = floor;
        System.out.println(floor + ". kata gitmek için buton basıldı.");
    }

    public void pressDoorOpen() {
        doorOpenButton = true;
        System.out.println("Kapı açma butonu basıldı.");
    }

    public void pressDoorClose() {
        doorCloseButton = true;
        System.out.println("Kapı kapama butonu basıldı.");
    }

    public void pressEmergency() {
        emergencyButton = true;
        System.out.println("ACİL DURUM butonu basıldı!");
    }
}