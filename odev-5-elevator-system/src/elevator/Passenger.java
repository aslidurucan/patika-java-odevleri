package elevator;

public class Passenger {
    private int id;
    private int sourceFloor;
    private int destFloor;

    public Passenger(int id, int sourceFloor, int destFloor) {
        this.id = id;
        this.sourceFloor = sourceFloor;
        this.destFloor = destFloor;
        System.out.println("Yolcu " + id + " oluşturuldu: " + sourceFloor + ". kattan " + destFloor + ". kata gidecek.");
    }

    public int getId() { return id; }
    public int getSourceFloor() { return sourceFloor; }
    public int getDestFloor() { return destFloor; }
}