public class Flight {

    private Plane plane;
    private int flightNo;
    private Destination destination;


    public Flight(Plane plane, int flightNo, Destination destination) {
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public int getFlightNo() {
        return this.flightNo;
    }

    public Destination getDestination() {
        return this.destination;
    }
}
