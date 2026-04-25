package flight;

public class Aircraft {
    private String id;
    private String status; // "active" veya "maintenance"
    private AircraftType type;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public AircraftType getType() { return type; }
    public void setType(AircraftType type) { this.type = type; }
}