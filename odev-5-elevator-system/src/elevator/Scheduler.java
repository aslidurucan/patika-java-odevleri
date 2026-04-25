package elevator;

import java.util.List;

public class Scheduler {
    private List<Elevator> elevators;

    public Scheduler(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public Elevator assign(int targetFloor) {
        Elevator closest = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {
            int distance = Math.abs(elevator.getCurrentFloor() - targetFloor);
            if (distance < minDistance) {
                minDistance = distance;
                closest = elevator;
            }
        }

        System.out.println("Asansör " + closest.getId() + " " + targetFloor + ". kata atandı.");
        return closest;
    }
}