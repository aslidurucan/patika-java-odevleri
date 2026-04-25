package elevator;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private int totalFloors = 12;
    private int totalElevators = 5;
    private List<Elevator> elevators = new ArrayList<>();
    private List<Floor> floors = new ArrayList<>();

    public void addElevator(Elevator elevator) { elevators.add(elevator); }
    public void addFloor(Floor floor) { floors.add(floor); }

    public List<Elevator> getElevators() { return elevators; }
    public List<Floor> getFloors() { return floors; }

    public int getTotalFloors() { return totalFloors; }
    public int getTotalElevators() { return totalElevators; }
}