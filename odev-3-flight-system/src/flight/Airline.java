package flight;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String id;
    private List<Aircraft> aircrafts = new ArrayList<>();
    private List<Pilot> pilots = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public void addAircraft(Aircraft aircraft) { aircrafts.add(aircraft); }
    public void addPilot(Pilot pilot) { pilots.add(pilot); }
    public void addFlight(Flight flight) { flights.add(flight); }

    public List<Aircraft> getAircrafts() { return aircrafts; }
    public List<Pilot> getPilots() { return pilots; }
    public List<Flight> getFlights() { return flights; }
}