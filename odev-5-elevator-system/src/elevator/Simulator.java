package elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulator {
    private Building building;
    private Clock clock;
    private Scheduler scheduler;
    private Random random;
    private List<Passenger> passengers = new ArrayList<>();

    public Simulator() {
        building = new Building();
        clock = new Clock();
        random = new Random();

        for (int i = 1; i <= building.getTotalElevators(); i++) {
            building.addElevator(new Elevator(i, building.getTotalFloors()));
        }

        for (int i = 1; i <= building.getTotalFloors(); i++) {
            building.addFloor(new Floor(i, building.getTotalElevators()));
        }

        scheduler = new Scheduler(building.getElevators());
    }

    public void run(int totalPassengers) {
        System.out.println("--- Simülasyon Başladı ---");
        for (int i = 1; i <= totalPassengers; i++) {
            clock.tick();
            int sourceFloor = random.nextInt(building.getTotalFloors()) + 1;
            int destFloor = random.nextInt(building.getTotalFloors()) + 1;

            Passenger passenger = new Passenger(i, sourceFloor, destFloor);
            passengers.add(passenger);

            Elevator elevator = scheduler.assign(sourceFloor);
            elevator.move(sourceFloor);
            elevator.getControlPanel().pressDestination(destFloor);
            elevator.move(destFloor);
        }
        System.out.println("--- Simülasyon Bitti ---");
    }
}