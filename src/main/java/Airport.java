import java.util.ArrayList;
import java.util.HashMap;

public class Airport {

    private ArrayList<Plane> hanger;
    private AirportCode airportCode;


    public Airport (AirportCode airportCode) {
        this.hanger = new ArrayList<>();
        this.airportCode = airportCode;
    }

    public ArrayList<Plane> getHanger() {
        return this.hanger;
    }

    public AirportCode getAirportCode() {
        return this.airportCode;
    }

    public void addPlaneToHanger(Plane plane) {
        this.hanger.add(plane);
    }

    public Flight createFlight(int flightNo, Destination destination) {
        Flight newFlight = new Flight(this.hanger.remove(0), flightNo, destination);
        return newFlight;
    }

    public HashMap sellTicket(Flight flight) {
        HashMap ticket = new HashMap();
        ticket.put("Price:", 35);
        ticket.put("Flight Number:", flight.getFlightNo());
        ticket.put("destination:", flight.getDestination());
        return ticket;
    }

}
