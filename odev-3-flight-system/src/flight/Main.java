package flight;

public class Main {
    public static void main(String[] args) {

        // Havaalanları
        Airport istanbul = new Airport();
        istanbul.setId("IST");
        istanbul.setName("İstanbul Havalimanı");

        Airport ankara = new Airport();
        ankara.setId("ESB");
        ankara.setName("Esenboğa Havalimanı");

        // Uçak tipi
        AircraftType boeing = new AircraftType();
        boeing.setTypeName("Boeing 737");
        boeing.setRequiredPilots(2);

        // Uçak
        Aircraft aircraft = new Aircraft();
        aircraft.setId("TC-JHV");
        aircraft.setStatus("active");
        aircraft.setType(boeing);

        // Pilotlar
        Pilot pilot = new Pilot();
        pilot.setId("P1");
        pilot.setName("Ahmet Yılmaz");
        pilot.setExperienceLevel(10);

        Pilot coPilot = new Pilot();
        coPilot.setId("P2");
        coPilot.setName("Ayşe Kaya");
        coPilot.setExperienceLevel(5);

        // Uçuş
        Flight flight = new Flight();
        flight.setId("TK101");
        flight.setDepartureAirport(istanbul);
        flight.setArrivalAirport(ankara);
        flight.setPilot(pilot);
        flight.setCoPilot(coPilot);
        flight.setAircraft(aircraft);

        // Hava yolu şirketi
        Airline airline = new Airline();
        airline.setId("TK");
        airline.addAircraft(aircraft);
        airline.addPilot(pilot);
        airline.addPilot(coPilot);
        airline.addFlight(flight);

        // Çıktı
        System.out.println("Uçuş: " + flight.getId());
        System.out.println("Kalkış: " + flight.getDepartureAirport().getName());
        System.out.println("İniş: " + flight.getArrivalAirport().getName());
        System.out.println("Pilot: " + flight.getPilot().getName());
        System.out.println("Yardımcı Pilot: " + flight.getCoPilot().getName());
        System.out.println("Uçak: " + flight.getAircraft().getId() + " - " + flight.getAircraft().getType().getTypeName());
    }
}