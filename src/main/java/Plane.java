import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private AirlineType airline;
    private ArrayList<Passenger> passengers;
    private int capacity;

    public Plane (PlaneType planeType, AirlineType airline) {
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();
        this.capacity = planeType.getCapacity();
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public AirlineType getAirline() {
        return this.airline;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public int getCapacity() {
        return this.capacity;
    }

}
