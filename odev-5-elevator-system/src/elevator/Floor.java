package elevator;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNumber;
    private List<FloorDoor> doors = new ArrayList<>();
    private List<ArrivalBell> bells = new ArrayList<>();
    private List<SignalLight> signalLights = new ArrayList<>();
    private List<CallButton> callButtons = new ArrayList<>();

    public Floor(int floorNumber, int totalElevators) {
        this.floorNumber = floorNumber;
        for (int i = 1; i <= totalElevators; i++) {
            doors.add(new FloorDoor(i));
            bells.add(new ArrivalBell(i));
            signalLights.add(new SignalLight());
        }
        callButtons.add(new CallButton("UP"));
        callButtons.add(new CallButton("DOWN"));
        callButtons.add(new CallButton("UP/DOWN"));
    }

    public int getFloorNumber() { return floorNumber; }
    public List<FloorDoor> getDoors() { return doors; }
    public List<ArrivalBell> getBells() { return bells; }
    public List<SignalLight> getSignalLights() { return signalLights; }
    public List<CallButton> getCallButtons() { return callButtons; }
}