package flight;

import java.util.Date;

public class Flight {
    private String id;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;
    private Pilot pilot;
    private Pilot coPilot;
    private Aircraft aircraft;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Airport getDepartureAirport() { return departureAirport; }
    public void setDepartureAirport(Airport departureAirport) { this.departureAirport = departureAirport; }

    public Airport getArrivalAirport() { return arrivalAirport; }
    public void setArrivalAirport(Airport arrivalAirport) { this.arrivalAirport = arrivalAirport; }

    public Date getDepartureTime() { return departureTime; }
    public void setDepartureTime(Date departureTime) { this.departureTime = departureTime; }

    public Date getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(Date arrivalTime) { this.arrivalTime = arrivalTime; }

    public Pilot getPilot() { return pilot; }
    public void setPilot(Pilot pilot) { this.pilot = pilot; }

    public Pilot getCoPilot() { return coPilot; }
    public void setCoPilot(Pilot coPilot) { this.coPilot = coPilot; }

    public Aircraft getAircraft() { return aircraft; }
    public void setAircraft(Aircraft aircraft) { this.aircraft = aircraft; }
}