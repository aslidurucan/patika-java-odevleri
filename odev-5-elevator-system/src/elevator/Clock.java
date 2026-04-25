package elevator;

import java.util.Date;

public class Clock {
    private Date timestamp;

    public Clock() {
        this.timestamp = new Date();
    }

    public void tick() {
        timestamp = new Date();
        System.out.println("Saat: " + timestamp);
    }

    public Date getTimestamp() { return timestamp; }
}